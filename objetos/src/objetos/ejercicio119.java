/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;


public class ejercicio119 {
    
    private int a;
    private int b;
    private int c;
    
    
    public ejercicio119() {


    }
    
    public ejercicio119 (int a, int b, int c) {
    
        this.a = a;
        this.b = b;
        this.c = c;
        
    }

    public void setCoeficientes (int uno, int dos, int tres) {
        
        this.a = uno;
        this.b = dos;
        this.c = tres;
    
    } 

    public int getA() {
        
        return a;
    
    }

    public int getB() {
    
        return b;
    
    }

    public int getC() {
    
        return c;
    
    }
    
    public boolean averigua() {
        
        boolean averigua = true;
        int res = b * b - 4 * a * c;
        
        if (a == 0 || res < 0) {
        
            averigua = false; 
        
        }
        
        return averigua;
            
    }  
    
    public double obtenerSolucion1() {
                        
        double solucion1;
        
        solucion1 = (-b + Math.sqrt(b * b - 4 * a * c)) /(2 * a);
        
        return solucion1;
        
    }
    
    public double obtenerSolucion2() {
    
        double solucion2;
        
        solucion2 = (-b - Math.sqrt(b * b - 4 * a * c)) /(2 * a);
        
        return solucion2;
        
    }

    @Override
    public String toString() {
        String ret;
        if (averigua()) {
        
            ret= "s1= "+ obtenerSolucion1();
                
        } else ret= "no tiene solución";
        
        return ret;
                
    }
    
    
    
      
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        int a, b ,c;
        
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        
        ejercicio119 uno = new ejercicio119(a, b, c);
        
        System.out.println(uno);
        
        
                
    }
    
}
