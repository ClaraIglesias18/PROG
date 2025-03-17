
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
public class reto1155 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
                
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        while (num1 >= 0 && num2 >= 0 ) {
        
            int perim = (num1 * 2) + (num2 * 2);
            System.out.println(perim);
            
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        
        }
        
        
    }
    
}
