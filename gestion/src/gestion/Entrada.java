/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import java.util.Scanner;

/**
 *
 * @author clara
 */
public class Entrada {
    
    /**
     * Lee una cadena del teclado
     *
     * @param mensaje Literal que especifica lo que el usuario debe introducir
     * @return String cadena leida del teclado
     */
    public static String leeCadena(String mensaje) {
        return leeCadena(mensaje, false);
    }

    /**
     * Lee una cadena del teclado
     *
     * @param mensaje Literal que especifica lo que el usuario debe introducir
     * @param permiteVacia True: campo no obligatorio; False: campo obligatorio
     * @return String cadena leida del teclado
     */
    public static String leeCadena(String mensaje, boolean permiteVacia) {
        String leer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(mensaje);

            leer = scanner.nextLine().trim();

            if (!permiteVacia && leer.length() == 0) {
                System.err.println("La cadena introducida no puede estar vacía. "
                        + "Por favor, introdúcela de nuevo.");
            }
        } while ((permiteVacia == false) && leer.length() == 0);

        return leer;
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

    /**
     * Lee un número entero de teclado, mostrando un mensaje que indica lo que
     * el usuario debe introducir.
     *
     * @param msg el mensaje a visualizar
     * @return el número, como entero
     */
    
    public static int leeNum(Scanner scan, String msg, int min, int max) {
        int ret;
        boolean error=false;
        do{
            ret=leeNum(scan,msg);
            //error=(ret<min || ret>max);
            if (ret<min || ret>max){
                System.out.println("El número debe estar entre "+min + " y "+max);
            }
        }while(ret<min || ret>max);
        
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
    
    public static int leeEntero(String msg) {
        boolean esValido = false;
        int toret = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print(msg);

            try {
                toret = Integer.parseInt(teclado.nextLine());
                esValido = true;
            } catch (NumberFormatException exc) {
                System.err.println("La cadena introducida no se puede "
                        + "convertir a número entero. Por favor, "
                        + "introdúcela de nuevo.");
            }
        } while (!esValido);

        return toret;
    }
    
    
}