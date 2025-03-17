
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
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero del 1 al 7: ");
        int num;
        num = leer.nextInt();
        
        if (num < 1 || num > 7) {
        
            System.out.println("El numero introducido no es valido");
            
        } else {
        
            System.out.println("El dia es: " + dias[num - 1]);
        
        }
    }
    
}
