
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
public class ejercicio85 {
    
    
     public static void pintastericos(int alto, int ancho) {
    
        
        for (int i = 0; i < ancho; i++) {
            
            System.out.print("*");
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < (alto - 2); i++) {
            
            System.out.print("*");
            for (int j = 0; j < (ancho - 2); j++) {
                
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println("");
            
        }
        
        for (int k = 0; k < ancho; k++) {
            
            System.out.print("*");            
            
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
                        
        int alto;
        System.out.println("Alto: ");
        alto = leer.nextInt();
        
        int ancho;
        System.out.println("Ancho: ");
        ancho = leer.nextInt();
        
        ejercicio85.pintastericos(alto, ancho);
        
    }
    
}
