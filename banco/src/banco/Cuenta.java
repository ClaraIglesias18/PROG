/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author dual109
 */
public class Cuenta {
    
    private Cliente titular;
    private double saldo;
    private int idCuenta;
    private static int totalCuentas = 0;
    
    
     /**
      * metodo para ingresar dinero en la cuenta
      * @param cantidad euros  ingresar
      * @return saldo tras ingreso
      */
    
    public double ingresar (double cantidad) {
        
        if (cantidad <= 0) {
        
            System.out.println("Tienes que ingresar una cantida positiva");
        
        } else {
        
            saldo += cantidad;
        
        }
    
        return saldo;
        
    }
    
    /**
     * metodo para retirar dinero de la cuenta
     * @param cantidad euros a retirar
     * @return cantidad que se a podido retirar del saldo
     */
    
    public double retirar (double cantidad) {
    
        if (cantidad < 0 || cantidad > saldo) {
        
            System.out.println("No se pueden retirar cantidades mayores que el saldo o negativas");
        
        } else {
        
            saldo -= cantidad;
        
        }
        
        return saldo;
        
        
        
    
    
    }

    public double getSaldo() {
        return saldo;
    }
    
    public Cuenta(Cliente titular, double saldo) {
        
        totalCuentas++;
        this.titular = titular;
        this.saldo = saldo;
        idCuenta = totalCuentas;
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + ", idCuenta=" + idCuenta + '}';
    }
    
    
    
}
