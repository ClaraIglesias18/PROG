
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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba su edad: ");
        int edad;
        edad = leer.nextInt();
        
        if (edad < 18) {
        
            System.out.println("Eres menor de edad");
            
        } else {
        
            System.out.println("Eres mayor de edad");
            
        }
       
        
    }
    
}
