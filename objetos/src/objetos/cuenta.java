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
public class cuenta {
           
    
    private String titular;
    private int saldo;
    
    public cuenta() {
    
                
    }
    
    public cuenta(String titular, int saldo) {
    
        this.saldo = saldo;
        this.titular = titular;
    
    }

    public int getSaldo() {
    
        return saldo;
    
    }
    
    public String getTitular() {
    
        return titular;
    
    }

    public void setSaldo(int saldo) {
        
        this.saldo = saldo;
    
    }
       
    public void setTitular(String titular) {
        
        this.titular = titular;
    
    }
    
    public void ingresar (int saldo) {
    
        if (saldo > 0) {
        
            this.saldo = this.saldo + saldo; 
        
        }
    
    }
    
    public void retirar (int saldo) {
    
        if (saldo > 0) {
        
            this.saldo = this.saldo - saldo;
            
        }
     
       
    }
    
    public void visualiza() {
    
        System.out.println(titular);
        System.out.println(saldo);
    
    }
    
    
    
    public static void main(String args[]) {
    
        cuenta una = new cuenta("clara" , 100);
        
        una.retirar(50);
        una.ingresar(800);
        
        
        una.visualiza();
        
    
    }
    
    
}
