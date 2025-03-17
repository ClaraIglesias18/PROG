
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual109
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba el valor de numero1: ");
        double num1;
        num1 = leer.nextDouble();
        
        System.out.println("Escribe el valor de numero2; ");
        double num2;
        num2 = leer.nextDouble();
        
        double temp;
        
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Numero1 = " + num1 + " " + "Numero2 = " + num2 );
        
     
    }
    
}
