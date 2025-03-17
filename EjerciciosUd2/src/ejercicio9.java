
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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el precio del producto1");
        double prec1;
        prec1 = leer.nextDouble();
        
        System.out.println("Escriba el precio del producto2");
        double prec2;
        prec2 = leer.nextDouble();
       
        System.out.println("Escriba el precio del producto3");
        double prec3;
        prec3 = leer.nextDouble();
        
        double media;
        media = (prec1 + prec2 + prec3) / 3;
        
        System.out.println("La media del precio de los poductor es: " + media);
    }
    
}
