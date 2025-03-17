/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual109
 */
public class ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //calcular media del 1 al 30
        
        double resultado;
        int suma = 0;
        int i;
        
        for (i = 1; i <= 30; i++) {
        
             suma = suma + i;
            
        }
        
        resultado = suma / i;
        System.out.println(resultado);
    }
    
}
