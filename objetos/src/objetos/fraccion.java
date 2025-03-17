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
public class fraccion {
    
    int numer;
    int denom;

    public fraccion(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }
    
    public void simplificar() {
    
        int temp = 0;
        int a = Math.max(numer, denom);
        int b = Math.min(numer, denom);
        
        while (b != 0) {
        
            temp = b;
            b = a % b;
            a = temp;
        
          
        }
        numer=numer/temp;
        denom=denom/temp;
        
        
    
    }
    
    public fraccion multiplica (fraccion otra) {
    
        String nueva;
        int numer2;
        int denom2;
        
        numer2 = this.numer * otra.numer;
        denom2 = this.denom * otra.denom;
        
        nueva = numer2 + "/" + denom2;
        
        
    }
    
    
    @Override
    public String toString() {
    
        String escribe = numer +
                         " / " + 
                         denom;
        
        return escribe;
    }
    
    
}
