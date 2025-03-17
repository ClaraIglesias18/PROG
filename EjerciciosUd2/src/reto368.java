
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
public class reto368 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int h,c;
        int div;
        int rest;
        
        Scanner leer = new Scanner(System.in);
        h = leer.nextInt();
        c = leer.nextInt();
        
        while (h != 0 || c != 0) {
        
            if (h <= c) {
            
                System.out.println("10");
            } else {
                              
                div = h / c; //numero de ollas completas
                rest = h % c; // calcular cuantas sobran
                
                if (rest > 0) {
                
                    System.out.println((div * 10) + 10);
                
                } else {
                
                    System.out.println(div * 10);
                
                }
                       
            }
            
            h = leer.nextInt();
            c = leer.nextInt();
        }
                      
    }
    
}
