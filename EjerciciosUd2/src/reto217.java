
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
public class reto217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        while (num != 0) {
        
            if (num % 2 == 0) {
            
                System.out.println("DERECHA");
            
            } else System.out.println("IZQUIERDA");
        
            num = leer.nextInt();
            
        }
        
    }
    
}
