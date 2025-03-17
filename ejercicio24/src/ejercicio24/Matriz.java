/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

/**
 *
 * @author DUAL109
 */
public class Matriz {
    
    int [][] matriz = new int [10][10];

    public int getMatriz() {
        
        int longitud = matriz.length;
        return longitud;
    
    }
    
    
    
    public void generarMatriz() {
        
        int colocar = 1;
        int res = 1;
        
        for (int i = 0; i < getMatriz(); i++) {
            
            colocar = res; 
            
            for (int j = 0; j < getMatriz(); j++) {
                
                matriz[i][j] = colocar;
                colocar++;
                
                if(j == 8) {
                
                    res = colocar; 
                    
                } else if (colocar > 10 ) {
                
                    colocar = 1;
                    res = colocar;                
                }
                
                
                
                
            }
        }
            
    }
    
    public void mostrar() {
    
        for (int i = 0; i < getMatriz(); i++) {
            
                System.out.println(" ");
            
            for (int j = 0; j < getMatriz(); j++) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            
        }
    
    
    }
    
}
