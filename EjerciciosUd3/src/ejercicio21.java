
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUAL109
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int[4][5];

        int [] sumafil = new int[4];
        int [] sumacol = new int[5];
        
        Random al = new Random();
        
        //llenar la matriz
        
        for (int i = 0; i < 4; i++) {
            
            int res = 0;
                        
            for (int j = 0; j < 5; j++) {
                                
                int num = al.nextInt(10) + 1;
                matriz[i][j] = num;
                
                res += num;
                
                sumafil[i] = res;
                
            }
            
            System.out.println("La suma de los elementos de la fila " + i + " --> " + res);
        
        }
        
        //recorrer la matriz al reves
        
        for (int i = 0; i < 5; i++) {
            
            int sumapar = 0;
            
            for (int j = 0; j < 4; j++) {
                
                if (matriz[j][i] % 2 == 0) {
                
                    sumapar += matriz[j][i]; 
                    sumacol[i] = sumapar;
                    
                }
                
            }
            
            System.out.println("La suma de los elementos pares de la columna " + i + " --> " + sumapar);
        }
        
        //mostrar la matriz
        
        for (int i = 0; i < 4; i++) {
            
                System.out.println(" ");
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print(" " + matriz[i][j] + " ");
                
            }
            
        }

     
       
        
    }
    
}
