
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
public class Reto117Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
      String cad;
      Scanner leer = new Scanner(System.in);
      
      num=leer.nextInt();
      leer.nextLine();
        for (int i = 0; i < num; i++) {
            cad=leer.nextLine();
            System.out.println(cad.replace("Soy", "Hola,")+".");
            
        }
        
      
      
    }
    
}
