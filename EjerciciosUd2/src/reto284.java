
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
public class reto284 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        int cuesta, paga;
        int num;
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            int dos =  0;
            int unos =  0;
            int cincuen =  0;
            int vein =  0;
            int diez =  0;
            int cin =  0;
            int uno =  0;
            
            cuesta = leer.nextInt();
            paga = leer.nextInt();
            
            int resta = paga - cuesta;
            if (resta < 0) {
            
                System.out.println("DEBE" + (cuesta - paga));
            
            } else if (resta == 0) {
            
                System.out.println(dos + unos + cincuen + vein + diez + cin + uno);
            
            } else {
            
                // ir comprobando paso por paso
            
            }
            
        }
        
    }
    
}
