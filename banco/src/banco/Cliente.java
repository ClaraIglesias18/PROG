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
public class Cliente {
 
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dni;
    private int direccion;
    private int idCliente;
    private static int totalCliente = 0;
    
    public Cliente(String nombre, String apellido1, String apellido2, int dni, int direccion) {
    
        totalCliente++;
        this.nombre = nombre;
        this.apellido2 = apellido2;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.direccion = direccion;
        this.idCliente = totalCliente;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() { 
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getDni() {
        return dni;
    }

    public int getDireccion() {
        return direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    public int getTotalCliente() {
        return totalCliente;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
    
    
    
    
}
