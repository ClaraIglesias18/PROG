
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
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el valor 1");
        double num1;
        num1 = leer.nextDouble();
        
        System.out.println("Escribe el valor 2");
        double num2;
        num2 = leer.nextDouble();
        
        System.out.println("Escribe el valor 3");
        double num3;
        num3 = leer.nextDouble();
        
        if (num1 < num2 && num2 < num3) {
        
            System.out.println(num1 + " < " + num2 + " < " + num3);
            
        } else if (num2 < num1 && num1 < num3) {
        
            System.out.println(num2 + " < " + num1 + " < " + num3);
        
        } else if (num2 < num3 && num3 < num1) {
        
            System.out.println(num2 + " < " + num3 + " < " + num1);
        
        } else if (num3 < num2 && num2 < num1) {
        
            System.out.println(num3 + " < " + num2 + " < " + num1);
        
        } else System.out.println(num3 + " < " + num1 + " < " + num2);
        
    }
    
}
