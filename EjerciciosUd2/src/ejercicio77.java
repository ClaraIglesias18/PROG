
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
public class ejercicio77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        while (num < 3 || num > 10) {
        
            System.out.println("El numero tiene que estar comprendido entre 3 y 10");
            System.out.println("Escriba otro numero: ");
            num = leer.nextInt();
        
        }
        
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("* ");
                
            }
            
            System.out.println("");
        }
        
    }
    
}
