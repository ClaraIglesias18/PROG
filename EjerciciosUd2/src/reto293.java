
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
public class reto293 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int casos;
        int insec, arac, crus, esca, anillos;
        
        casos = leer.nextInt();
        
        for (int i = 0; i < casos; i++) {
            
            int patas = 0;
            
            insec = leer.nextInt();
            arac = leer.nextInt();
            crus = leer.nextInt();
            esca = leer.nextInt();
            anillos = leer.nextInt();
            
            patas = (insec * 6) + (arac * 8) + (crus * 10) + (esca * (anillos * 2));
            System.out.println(patas);
            
        }
        
    }
    
}
