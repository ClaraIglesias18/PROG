
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
public class reto413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int ancho, largo;
        int num;
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            ancho = leer.nextInt();
            largo = leer.nextInt();
            int total = ancho * largo;
            
            if (total % 2 == 0) {
            
                System.out.println((total / 2) + " " + (total / 2) );
                
            } else {
            
                int resto = total % 2;
                 System.out.println(((total / 2) + resto) + " " + (total / 2) );
            
            }
            
        }
        
    }
    
}
