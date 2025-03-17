/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Random;

/**
 *
 * @author DUAL109
 */
public class Matriz {
 
    Random al = new Random();
    
    private int [][] matriz = new int [5][5];
    
    public void generaMatriz(int fil, int col) {
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = al.nextInt();
                
            }
            
        }
    
    }
    
    public void comprobacionSilla() {
        
        int menor = matriz[0][0];
        int mayor = matriz[0][0];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                if(matriz[i][j] < menor) {
                
                    menor = matriz[i][j];
                                        
                }
                
            }
            
        }
    
    
    }
    
}
