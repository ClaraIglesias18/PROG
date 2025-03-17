/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacioncontenedores;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class ExplicacionContenedores {
    
    public static int leeNum(Scanner scan, String msg, int min, int max) {
    
        int ret;
        boolean error = false;
        
        do {
        
            ret = leeNum(scan, msg);
            error = (ret < min || ret > max);
            
            if (error) {
            
                System.out.println("El numero debe estar entre " + min + " y " + max);
            
            } 
            
        }while(error);
            
        
               
        return ret;
    
    
    }
    
    public static int leeNum(Scanner scan, String msg) {
        int ret = 0;
        boolean repite;
        String cad;
        do {
            repite = false;
            System.out.print("\n" + msg);
            cad = scan.nextLine();
            try {

                ret = Integer.parseInt(cad);
            } catch (NumberFormatException exc) {
                System.err.format("   Ha sido imposible convertir %s a entero\n", cad);
                repite = true;
            }
        } while (repite);
        return ret;
    }

    public static Posicion leePosicion(Scanner scan) {
        StringBuilder cad = new StringBuilder("Escoja la posición: \n");
        int num;

        for (int i = 0; i < Futbolista.Posicion.values().length; i++) {
            cad.append(i + ".- " + Posicion.values()[i].toString() + "\n");
        }
        do {
            num = leeNum(scan, cad.toString());
        } while (num < 0 || num >= Posicion.values().length);

        return (Posicion.values()[num]);

    }

    public static Futbolista leeFutbolista(Scanner scan) {
        String nombre;
        int anho;
        Posicion pos;

        nombre = leeCadena(scan, "Nombre del futbolista: ");
        anho = leeNum(scan, "Año de nacimiento del atleta: ");
        pos = leePosicion(scan);

        return (new Futbolista(nombre, anho, pos));
    }

    public static String leeCadena(Scanner scan, String msg) {
        String cad;
        boolean repite;
        do {
            repite = false;
            System.out.println(msg);
            cad = scan.nextLine();
            if (cad.trim().isEmpty()) {
                repite = true;
                System.err.println("La cadena no puede estar vacía");
            }
        } while (repite);
        return cad;
    }

    public static int menu(Scanner scan) {
        int ret;
        System.out.println("MENU\n");
        System.out.println("1.- Insertar Jugador");
        System.out.println("2.- Ver Jugadores");
        System.out.println("3.- Salir");
        do{
            ret=leeNum(scan, "Opción: ");
        } while (ret<1 || ret >3);
        return ret;
    }
    public static int leeDorsal(Scanner scan, Equipo eq){
        int ret;
        
        do{
            ret=leeNum(scan,"Introduzca el dorsal deseado: ");
        }while (!eq.estaLibre(ret));
        
        return ret;
    }

    public static void prueba() {
        Futbolista f1 = new Futbolista("Pepito Pérez", 2001, Futbolista.Posicion.PORTERO);
        Futbolista f2 = new Futbolista("Pepita Pérez", 2021, Futbolista.Posicion.DELANTERO);

        Equipo eq = new Equipo("CIFP A CARBALLEIRA", "Carballo", "Plaza d ela Legión s/n");
        try {
            eq.insertaFutbolista(f1, 10);
            eq.insertaFutbolista(f2, 11);
        } catch (Exception ex) {
            System.out.println("Error en la inserción " + ex.getMessage());
        }
        System.out.println(eq);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo eq = new Equipo("CIFP A CARBALLEIRA", "Carballo", "Plaza d ela Legión s/n");
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            op=menu(leer);
            switch (op) {
                case 1:
                    try{
                        
                        eq.insertaFutbolista(leeFutbolista(leer),leeDorsal(leer, eq) );
                    }catch (Exception ex) {
                        System.out.println("El equipo ya está completo. ");
                        System.err.println(ex.getMessage());
                    }
                    
                    break;
                case 2:
                    System.out.println(eq);
                    break;
               
            }
        } while (op!=3);
        

    }
}

