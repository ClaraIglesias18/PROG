
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
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int num;
        num = leer.nextInt();
        
        if (num / 100 > 0) {
        
            System.out.println(num/100 + " de 100");
            num = num % 100;
        
        }
        if (num / 50 > 0) {
        
            System.out.println(num/50 + " de 50");
            num = num % 50;
        }
        if (num / 20 > 0) {
        
            System.out.println(num/20 + " de 20");
            num = num % 20;
        }
        if (num / 10 > 0) {
        
            System.out.println(num/10 + " de 10");
            num = num % 10;
        }
        if (num / 5 > 0) {
        
            System.out.println(num/5 + " de 5");
            num = num % 5;
        }
        if (num / 1 > 0) {
        
            System.out.println(num/5 + " de 1");
        }
        
        
    }
    
}
