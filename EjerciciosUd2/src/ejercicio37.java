/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual109
 */
public class ejercicio37 {
    
    //ejemplo de metodo
    public static boolean esPar(int num) {
    
        return(num % 2 ==0);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //suma num pares impares
        
        int sump = 0;
        int sumi = 0;

        for (int i = 0; i <= 1000 ; i++) {
        
            if (esPar(i)) {
            
                    sump = sump + i;
            
            } else sumi = sumi + i;
        }
        
        System.out.println("Suma numeros pares = " + sump);
        System.out.println("Suma numero impares = " + sumi);
        
    }
    
}
