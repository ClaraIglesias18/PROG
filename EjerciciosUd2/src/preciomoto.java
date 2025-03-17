
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
public class preciomoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //precio > 6000
        // &&
        //antiguedad < 2
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime el precio de la moto: ");
        double precio;
        precio = leer.nextDouble();
        
        System.out.println("Dime la atiguedad de carne: ");
        double ant;
        ant = leer.nextDouble();
        
        if (precio > 6000 && ant > 2) {
    
            System.out.println("Puedes comprar la moto");
        
        } else {
                
            System.out.println("No puedes comprar la moto.");
                
        }
               
        
        
    }
    
}
