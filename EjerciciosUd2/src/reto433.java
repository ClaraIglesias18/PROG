
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
public class reto433 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
                
        Scanner leer = new Scanner(System.in);
        
        num = leer.nextInt();
        
        
        while (num != 0) {
            
            int count = 0;
            int linea = 0;
            int nuevalinea = 0;
            
            while (nuevalinea < num) {
                            
                linea = linea + 1;
                nuevalinea = nuevalinea + linea;
                count++;
            
            }
        
            System.out.println(count);
            num = leer.nextInt();
            
        }
                
        
    }
    
}
