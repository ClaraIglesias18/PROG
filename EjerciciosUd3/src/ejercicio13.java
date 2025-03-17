
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aldar
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre[] = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String apellidos1[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        
        String apellidos2[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        
        Random genera = new Random();
        
        for (int i = 0; i < 5; i++) {
            
            int aux = genera.nextInt(4);
            String nom, apel1, apel2;
            
            nom = nombre[aux];
            apel1 = apellidos1[aux];
            apel2 = apellidos2[aux];
        
            System.out.println(nom + " " + apel1 + " " + apel2);
            
        }
        
        
    }
    
}
