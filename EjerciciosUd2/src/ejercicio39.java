
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
public class ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int mayor = 0;
            int num;
                
            Scanner leer = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            num = leer.nextInt();
                
        while (num != -1) {
        
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            num = leer2.nextInt();
            
            if (num > mayor) mayor = num;
            
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
    }
    
}
