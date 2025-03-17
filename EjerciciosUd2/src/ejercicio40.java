
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
public class ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, mult;
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanton multiplos?");
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
        
            mult = i * 2;
            System.out.println(mult + " ");
        
        }
        
        
    }
    
}
