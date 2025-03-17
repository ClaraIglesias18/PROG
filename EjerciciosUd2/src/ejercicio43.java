
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
public class ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2;
        int result = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        for (int i = 0; i < num2; i ++) {
        
            result = result + num1;
        
        }
        
        System.out.println("Resultado : " + result);
        
        
    }
    
}
