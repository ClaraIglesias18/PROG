
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUAL109
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    
    
    //comprobar haciendo la traspuesta
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int orden = 4;
        int [][] matriz = new int [orden][orden];
        
        boolean simetria = true;
        int f = 0;
        int c = 0;
        
        Random al = new Random();
        
        //insertamos valores aleatorios en la matriz
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = al.nextInt();
                
            }
            
        }
        
        //comprobamos la simetria
        
        while (simetria && f < orden) {
                        
            while (simetria && c < orden) {
            
                if(matriz[f][c] != matriz [c][f]) {
                
                    c++;
                
                }
                f++;
            }
        
        
        }
        
        if (simetria) {
        
            System.out.println("Es simetrica");
            
        } else {
        
            System.out.println("No es simetrica");
            
        }
        
    }
    
}
