
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
public class ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int dig = 0;
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero: ");
        num = leer.nextInt();
        
        while (num != 0) {
        
            num = num / 10;
            dig++;
            
        }
        
        System.out.println("El numero tiene: " + dig + " cifras");
        
        
    }
    
}
