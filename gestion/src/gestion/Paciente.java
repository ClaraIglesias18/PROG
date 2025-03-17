/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author clara
 */
public class Paciente extends Persona {
    private String direccion;
    private String enfermedad;
    private int codigo;
    private int numeroPacientes = 0;
    
    public Paciente (String nombre, String apellido, int ano, String direccion, String enfermedad) {
    
        super(nombre, apellido, ano);
        setDireccion(direccion);
        setEnfermedad(enfermedad);
        this.numeroPacientes = this.codigo;
            
    }
    
    public void setDireccion(String direccion) throws IllegalArgumentException {
    
        if (direccion.isBlank()) {
            
            throw new IllegalArgumentException("El campo direccion no puede estar vacio");
        
        }
        
        this.direccion = direccion;
    
    }
    
    public void setEnfermedad (String enfermedad) throws IllegalArgumentException {
    
        if (enfermedad.isBlank()) {
        
            throw new IllegalArgumentException("El campo enfermedad no puede estar vacio");
        
        }
        
        this.enfermedad = enfermedad;
    
    }

    public String getDireccion() {
        
        return direccion;
    
    }

    public String getEnfermedad() {
    
        return enfermedad;
   
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        
        ret.append(super.toString());
        ret.append("\n\tDireccion: ").append(direccion);
        ret.append("\n\tCodigo: ").append(codigo);
        ret.append("\n\tEnfermedad: ").append(enfermedad);
                
        return ret.toString();
    
    }
}
