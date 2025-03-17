/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author dual109
 */
public class triangulo {

    int base;
    int altura;
    double hipotenusa () {
                   
        return Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2)) ;
        
    }
    
    
    public double area () {
    
        return base * altura / 2;
    
    }
    
       
    
}
