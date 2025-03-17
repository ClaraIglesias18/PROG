
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author clara
 */
public class reto369 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        int num;
        num = leer.nextInt();
        
        while(num != 0) {
        
            for (int i = 0; i < num; i++) {
                
                System.out.print("1");
                
            }
            
            System.out.println("");
            num = leer.nextInt();
        }
        
    }
    
}
