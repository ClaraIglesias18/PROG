
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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int prem = 450;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el numero de su boleto: ");
        int boleto;
        boleto = leer.nextInt();
        
    
        if (boleto == prem) {
        
            System.out.println("Enhorabuena, tu boleto esta premiado.");
        
        } else {
        
            System.out.println("Sigue intentandolo.");
        
        }
            
    }
    
}
