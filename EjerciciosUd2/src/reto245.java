
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
public class reto245 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int alt[];
        boolean dalton = true;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero de hermanos: ");
        num = leer.nextInt();
        
        while (num != 0) {
        
            alt = new int[num];
            int anterior = 0;
            System.out.println("Altura: ");
            for (int i = 0; i < num; i++){
            
                alt[i] = leer.nextInt();
                if (anterior >= alt[i]) dalton = false; 
            
            }
            
        if (num == 4 && dalton) {
            
            System.out.println("DALTON");
            
        } else System.out.println("DESCONOCIDOS");
        
        System.out.println("Numero de hermanos: ");
        num = leer.nextInt();
        
        }    

    }
    
}
