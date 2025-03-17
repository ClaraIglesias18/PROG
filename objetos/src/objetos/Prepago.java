/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author clara
 */
public class Prepago {
    
    private int numTelefono;
    private String nif;
    private double saldo;
    private Tiempo consumo;
        
    public Prepago() {
    
    }
    
    public Prepago(int numeroTelefono, String nif, double saldo) {
        
        this.consumo= new Tiempo();
        this.numTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
    
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setConsumo(Tiempo consumo) {
        this.consumo = consumo;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public String getNif() {
        return nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public Tiempo getConsumo() {
        return consumo;
    }
    
    public void ingrgresarSaldo(int cant) {
    
        if(cant > 0) {
        
            saldo = saldo + cant;
        
        }
    
    }
    
    public void enviarMensaje(int num) {
    
        if (num > 0) {
        
            saldo = saldo - (9 * num);
        
        }
        
    }
    
    public void llamdaRealizada(int seg) {
    
        if(seg > 0) {
        
            saldo = saldo - (20 + seg);        
            consumo.incrementarTiempo(seg);
            
        }
        
    }
    
    public void consultarNumero() {
    
        System.out.println("Numero: " + numTelefono);
        System.out.println("NIF: " + nif);
        System.out.println("Saldo: " + saldo);
        System.out.println("Consumo: " + consumo);
    
    
    }
    
}
