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
public class rectangulo {
    
    private int largo;
    private int alto;

    public rectangulo() {
    
        this.largo = 4;
        this.alto = 2;
    
    }
    
    public rectangulo(int largo, int alto) {
    
        this.largo = largo;
        this.alto = alto;
    
    }

    public int getLargo() {
        
        return largo;
    
    }
    
    public int getAlto() {
    
        return alto;
    
    }

               
        
    public int perimetro() {
        
        int perimetro = alto * 2 + largo * 2;
        return perimetro;
    
    }
    
    public int superficie() {
        
        int superficie = alto * largo;
        return superficie;
        
    }
    
    public void visualiza() {
    
        System.out.println("largo: " + largo);
        System.out.println("alto: " + alto);
        System.out.println("superficie: " + superficie());
        System.out.println("perimetro: " + perimetro());
        
    }
    
    public static void main(String args[]) {
    
        rectangulo uno = new rectangulo(5, 9);
        
                
        uno.visualiza();
        
        
        
    }
    
        
}
