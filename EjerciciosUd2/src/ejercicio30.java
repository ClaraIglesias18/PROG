
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
public class ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] meses = {1,3,5,7,8,10,12};
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        int dia;
        dia = leer.nextInt();
        
        System.out.println("Introduce el mes: ");
        int mes;
        mes = leer.nextInt();
        
        System.out.println("Introduce el año: ");
        int año;
        año = leer.nextInt();
        
        if (dia == 31 && mes != meses[mes]) {
        
            System.out.println("El dia es incorrecto en funcion del mes");
        
        } else if (dia < 1 || dia > 31) {
        
            System.out.println("El dia es incorrecto");
            
        } else System.out.println("Dia: " + dia); 
        if (año < 0) {
            
            System.out.println("El año no puede ser negativo");
            
        } else System.out.println("Año: " + año);
        if (mes < 1 || mes > 12) {
        
            System.out.println("El mes es incorrecto");
            
        } else System.out.println("Mes: " + mes); 
        
        
        
        
        
    }
    
}
