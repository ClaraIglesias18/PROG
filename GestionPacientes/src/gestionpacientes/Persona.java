/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpacientes;

/**
 *
 * @author clara
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int ano;
    
    public Persona(String nombre, String apellido, int ano) {
    
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setAno(ano);
    
    }    
    
    public void setNombre(String nombre) throws IllegalArgumentException {
    
        if (nombre.isBlank()) {
        
            throw new IllegalArgumentException("El campo Nombre no puede estar vacio");
        
        }
        
        this.nombre = nombre;
        
    }
    
    public void setApellido (String apelldio) throws IllegalArgumentException {
    
        if (apellido.isBlank()) {
        
            throw new IllegalArgumentException("El campo Apellido no puede estar vacio");
        
        }
        
    }
    
    public void setAno (int ano) throws IllegalArgumentException {
    
        if (ano < 0) {
        
            throw new IllegalArgumentException("El campo Ano no puede ser negativo");
        
        }
        
        this.ano = ano;
        
    }
    
    public String getNombre() {
    
        return nombre;
    
    }
    
    public String getApellido() {
    
        return apellido;
    
    }
    
    public int getAno() {
    
        return ano;
        
    }

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        ret.append("\n\tPersona: ").append(this.getNombre());
        ret.append("\n\tApellido").append(this.getApellido());
        ret.append("\n\tAños: =").append(this.getAno());
        
        return ret.toString();
    
    }
    
}
