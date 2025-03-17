
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
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String asig = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el numero de DNI");
        int num;
        num = leer.nextInt();
        
        if (num < 10000000 || num > 99999999) {
        
            System.out.println("DNI no valido");
            
        } else {
        
            int mod;    
            mod = num % 23;
            char letra = asig.charAt(mod);
            System.out.println("La letra de DNI es: " + letra);
        
        }
        
    }
    
}
