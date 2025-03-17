
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
public class reto360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        for (int j = 0; j < num; j++) {
            
            int cont = 0;
            
            int i;
            i = leer.nextInt();
            
            int m;
            m = leer.nextInt();
            
            int perdida;
            perdida = leer.nextInt();
            
            int res;
            res = i;
            
            while(perdida != -1){
                
                               
                res = res - perdida;
               
                if (res < m) {
               
                   res = i;
                   cont++;
               
                }
               
                perdida = leer.nextInt();
            
            }
            
            System.out.println(cont);
            
        }
        
    }
    
}
