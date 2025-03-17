
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
public class ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //mayor 
        
        int mayor = 0;
        
        for (int i = 0; i < 10; i++) {
        
            Scanner leer = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int num;
            num = leer.nextInt();
            
            if (num > mayor) mayor = num;
            
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
        
        
        
        
    }
    
}
