/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersona;

/**
 *
 * @author dual109
 */
public class Persona {
 
    private String dni;
    private String nombre;
    
    public Persona(String dni, String nombre) throws IllegalArgumentException{
        
         if (dni.isBlank()) {
         
             throw new IllegalArgumentException("El campo dni no puede estar vacio");
         
         }
         
         if (nombre.isBlank()) {
         
             throw new IllegalArgumentException("El campo nombre no puede estar vacio");
         
         }
         
         this.dni = dni;
         this.nombre = nombre;
    
    }

    public String getDni() {
        
        return dni;
    
    }
    
    public String getNombre() {
    
        return nombre;
    
    }

    public void setDni(String dni) {
    
        this.dni = dni;
   
    }
    
    public void setNombre (String nombre) {
    
        this.nombre = nombre;
    
    } 

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        
        ret.append("\n\tDni: ").append(getDni());
        ret.append("\n\tNombre: ").append(getNombre());
        
        return ret.toString();
        
    }
    
    
    
    
    
}
