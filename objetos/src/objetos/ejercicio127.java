/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos;

public class ejercicio127 {

    private int numeroTelefono;
    private String nif;
    private double saldo;
    private Tiempo consumo;
    
        
    public ejercicio127() {
    
        
    }
    
    public ejercicio127(int numeroTelefono, String nif, double saldo) {
    
        this.numeroTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
    
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
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

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
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
    
    public void ingresarSaldo(double ingreso) {

        if (ingreso > 0) {
        
            saldo = saldo + ingreso;
        
        } else System.out.println("El ingreso tiene que ser mayor que 0");

    }
    
    public void enviarMensaje(int cantidad) {
    
        if(cantidad > 0) {
        
            saldo = saldo - (cantidad * 0.09);
        
        } else System.out.println("La cantidad de mensajes debe ser mayor a 0");
    
    }
    
    public void llamadaRealizada(int seg) {
    
        if (seg > 0) {
        
            saldo = saldo - (seg + 20);
            
        
        } else System.out.println("Los segundos tienen que ser mayor que 0");
        
        
            
    }
    
    public void consultarNumero() {
    
        System.out.println(numeroTelefono);
        System.out.println(saldo);
        System.out.println(consumo);
        System.out.println(nif);
    
    }
                   
    
    public static void main(String[] args) {
        
    }
    
}

