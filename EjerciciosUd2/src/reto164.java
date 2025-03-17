
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
public class reto164 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1; 
        int num2; 
        int num3; 
        int num4;
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        while (num1 <= num3 && num2 <= num4) {
        
            num3 = num3 - num1;
            num4 = num4 - num2;
        
            int area = num4 * num3;
            
            System.out.println(area);
            
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            num3 = leer.nextInt();
            num4 = leer.nextInt();
            
        }
                
        //WRONG ANSWER
    }
    
}
