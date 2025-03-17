/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*persona yo = new persona();
        
        yo.nombre = "Clara";
        yo.apellido = "Iglesias";
        yo.edad = 21;
        
        
        System.out.println(yo.nombre + " " + yo.apellido + " " + yo.edad);
        */
        
        /*Scanner leer = new Scanner(System.in);
        
        triangulo trian1 = new triangulo();
                        
        trian1.base = leer.nextInt();
        trian1.altura = leer.nextInt();
                
        System.out.println(trian1.area()+ " " + trian1.hipotenusa());
        */
        
        fraccion uno = new fraccion(24,4);
        
        uno.simplificar();
        System.out.println(uno);
        
    }
    
}
