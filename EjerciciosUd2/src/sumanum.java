
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
public class sumanum {
    
    
    public static int suma(int num1, int num2) {
    
               
        return (num1 + num2);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println(sumanum.suma(num1 = leer.nextInt(), num2 = leer.nextInt()));
        
    }
    
}
