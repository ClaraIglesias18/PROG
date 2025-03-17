/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        String letra;
                
        cadena = leer.nextLine();
        letra = leer.nextLine();
        
        char letraChar = letra.charAt(0);
        
        int num = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
                        
            char cadenaChar = cadena.charAt(i);
            if (letraChar == cadenaChar) {
                                
                num = num + 1;
            
            }
            
        }
        
        System.out.println("Numero de ocurrencias = " + num);
        
    }
    
}
