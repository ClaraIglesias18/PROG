
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
public class reto407 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
                        
        int c, p, t;
        
        c = leer.nextInt();
        p = leer.nextInt();
        t = leer.nextInt();
        
        while (c != 0 || p != 0 || t != 0) {
        
            int dif = c - p;
            
            if (t > dif) {
            
                int resta = 0;
                int fin = 0;
                resta = t - dif;
                fin = c - resta;
                System.out.println(fin);
                
            } else {
            
                System.out.println(p + t);
                
            }
            
            c = leer.nextInt();
            p = leer.nextInt();
            t = leer.nextInt();
        
                              
        }
    }
    
}
