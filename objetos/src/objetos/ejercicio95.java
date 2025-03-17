/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class ejercicio95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        Random premio = new Random();
        
        int prem = premio.nextInt(101);
        System.out.println(prem);
        
        int intent = 1;
        
        int num;
        num = leer.nextInt();
        
        if (num == prem) {
            
            System.out.println("Felicidades! Su numero de intentos es: " + intent + " intentos");
        
        } else {
        
            while (num != prem) {
            
                if (num > prem) {
                
                    System.out.println("El numero introducido es mayor");
                
                } else {
                
                    System.out.println("El numero introducido es menor");
                
                }
                
                intent++;
                num = leer.nextInt();
            
            }
            
            System.out.println("Felicidades! Su numero de intentos es: " + intent + " intentos");
        
        }
        
    }
    
}
