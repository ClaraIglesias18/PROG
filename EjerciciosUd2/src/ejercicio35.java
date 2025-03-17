
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
public class ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //leer num y mostrar sus dividores
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int num;
        num = leer.nextInt();
        
        int cont = 1;
        
        while (cont <= num) {
        
            if (num % cont == 0) {
            
                System.out.println(cont);
                
            }
            
            cont++;
        
        }
        
        
        
    }
    
}
