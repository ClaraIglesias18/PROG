/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class saludos {
    
    public static void saludo(int num, String nombre) {
    
        for (int i = 0; i < num; i++) {
            
            System.out.println("Hola " + nombre);            
            
        }
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Como te llamas?");
        nombre = leer.nextLine();
        
        int num;
        System.out.println("Cuantas veces?");
        num = leer.nextInt();
        
        saludos.saludo(num, nombre);
    
    }
    
}
