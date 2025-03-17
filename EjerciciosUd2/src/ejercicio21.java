
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
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el precio de la venta: ");
        double venta;
        venta = leer.nextDouble();
        
        if (venta <= 200) {
        
            System.out.println("El importe de la venta es: " + venta);
            
        } else if (venta > 200 && venta <= 100) {
        
            venta = venta * 0.95;
            System.out.println("El precio final es: " + venta);
        
        } else {
        
            venta = venta * 0.90;
            System.out.println("El precio final de venta es: " + venta);
        
        }
        
    }
    
}
