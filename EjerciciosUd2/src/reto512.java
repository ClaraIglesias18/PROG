
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
public class reto512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        int conejo;
        int caballo;
        
        for (int i = 0; i < num; i++) {
            
            conejo = leer.nextInt();
            caballo = leer.nextInt();
            int porcentaje = (conejo * 100) / (conejo + caballo);
            System.out.println(porcentaje);
            
        }
                
    }
    
}
