/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Random;

/**
 *
 * @author dual109
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random tiradas = new Random ();
        
        int count = 0;
        
        for (int i = 0; i < 100; i++) {
            
            int tirada1 = tiradas.nextInt(6) + 1;
            System.out.println(tirada1);
            int tirada2 = tiradas.nextInt(6) + 1;
            System.out.println(tirada2);
            
            if (tirada1 + tirada2 == 7) {
            
                count++;
            
            }
            
            System.out.println("");
        }
        
        System.out.println(count);
        
    }
    
}
