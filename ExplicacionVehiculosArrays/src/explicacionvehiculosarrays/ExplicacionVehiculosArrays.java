/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionvehiculosarrays;

import java.util.Scanner;

/**
 *
 * @author jnieto
 */


public class ExplicacionVehiculosArrays {
    
    
    public  enum Colores {BLANCO, AZUL,NEGRO,VERDE};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        String mat, brand, colour;
        Vehiculo [] coches= new Vehiculo[3];
        boolean encontrado;
        int cont;
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println("Color: ");
            colour=leer.nextLine();
            System.out.println("Matrícula ");
            mat=leer.nextLine();
            System.out.println("Marca: ");
            brand=leer.nextLine();
            coches[i]=new Vehiculo(mat,colour,brand);
        }
        System.out.println("Mostrar coches: ");
        for (int i = 0; i < coches.length; i++) {
            System.out.println( coches[i]);
        }
        System.out.println("Teclee la matrícula buscada: ");
        mat=leer.nextLine();
        cont=0;
        encontrado=false;
        while (!encontrado && cont<coches.length) {
            if (coches[cont].tieneMatricula(mat)) encontrado=true;
            else ++cont;
        }
        if (!encontrado) System.out.println("La matrícula buscada no se encuentra en nuestro taller");
        else System.out.println("Encontrado: "+ coches[cont]);
        
        Vehiculo v = new Vehiculo("v","blanco","seat");
        System.out.println(v.tieneMatricula("v"));
        
        System.out.println("Introduzca el color");
        colour= leer.nextLine();
        
        for (int i = 0; i < coches.length; i++) {
            if (coches[i].esColor(colour)) System.out.println(coches[i]);
            
        }
        
        for (Vehiculo coche : coches) {
            if (coche.esColor(colour)) System.out.println(coche);
        }
       
        
        
        
        
    }
    
}
