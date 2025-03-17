
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
public class reto355 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Año bisiesto es divisible entre 4
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            int año;
            año = leer.nextInt();
            
            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0) ) {
            
                System.out.println(29);
            
            } else System.out.println(28);
            
        }
        
    }
    
}
