
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
public class reto117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        num = leer.nextInt();
        leer.nextLine();
        
                                
            String nombreCom;
            String[] resultado = new String[num];
            
            for (int i = 0; i < num; i++) {
            
                nombreCom = leer.nextLine();
                String[] nombre = nombreCom.split("\\s+");
                resultado[i] = nombre[1];
                                                                
            }
            
                        
            for (int i = 0; i < num; i++) {
            
                System.out.println("Hola, " + resultado[i] + ".");
            
            }
                 
                        
    }
    
}
