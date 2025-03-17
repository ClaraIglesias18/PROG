
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
public class reto340 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //calcular numero de cuadrados numc = L1 * (L2 - 1)
        //calcular numero de cerillas numcer * 4
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int l1, l2;
        int prim = 4;
        int x, y;
        
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            l1 = leer.nextInt();
            l2 = leer.nextInt();
            
            x = l1 - 1;
            y = l2 - 1;
            
            int inter = 2 * x * y;
            int hor = x * 3;
            int ver = y * 3;
            
            int total = inter + hor + ver + prim;
            
            System.out.println(total);
            
            
        }
                        
                
    }
    
}
