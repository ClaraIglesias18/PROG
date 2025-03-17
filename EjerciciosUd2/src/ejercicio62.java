
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
public class ejercicio62 {

    public static boolean esPrimo(int num) {
        
        boolean prim = false;
        int div = 0;
        
        for (int i = 1; i < num; i++) {
            
            if(num % i == 0) {
            
                div++;
            
            }
                                   
        }
        
        if (div == 2 ) {
            
            prim = true;
        
        } else {
        
            prim = false;    
        
        }
        
        return (prim);
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic 
        
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        for (int i = 2; i < num; i++) {
            
            if (esPrimo(i)) System.out.println(i);
            
        }
    
    }
    
}
