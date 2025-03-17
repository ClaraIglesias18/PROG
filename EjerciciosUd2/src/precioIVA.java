
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
public class precioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("IVA a aplicar: ");
        double iva;
        iva = leer.nextDouble();
        
        System.out.println("Dime el precio del producto: ");
        double precio;
        precio = leer.nextDouble();
        
        double precFin;
        precFin = ((iva / 100)  + 1) * precio;
        
        System.out.println("El precio final es: " + precFin);
        
    }
    
}
