/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author dual109
 */
public class Arbol {
    
    public static int numArboles = 0;
    
    public Arbol() {
    
        numArboles++;
    
    }
    
    public static void main(String[] args) {
    
        Arbol Arbol1 = new Arbol();
        Arbol Arbol2 = new Arbol();
        Arbol Arbol3 = new Arbol();
        Arbol Arbol4 = new Arbol();
        Arbol Arbol5 = new Arbol();
    
        System.out.println(Arbol.numArboles);
        
    }
    
}
