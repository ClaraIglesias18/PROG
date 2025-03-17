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
public class Profesor extends Persona {
    
    private String despacho;
    private String asignatura;
    
    public Profesor (String despacho, String asignatura, String dni, String nombre) {
    
        super(dni, nombre);
        
        if (despacho.isBlank()) {
        
            throw new IllegalArgumentException("El campo despacho no puede estar vacio");
        
        } else this.despacho = despacho;
        
        if (asignatura.isBlank()) {
        
            throw new IllegalArgumentException("El campo asignatura no puede estar vacio");
        
        } else this.asignatura = asignatura;
        
    }

    public String getDespacho() {
     
        return despacho;
    
    }

    public String getAsignatura() {
    
        return asignatura;
    
    }

    public void setDespacho(String despacho) {
    
        this.despacho = despacho;
    
    }

    public void setAsignatura(String asignatura) {
    
        this.asignatura = asignatura;
    
    }

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        
        ret.append(super.toString());
        ret.append("\n\tAsignatura: ").append(asignatura);
        ret.append("\n\tDespacho: ").append(despacho);
        
        return ret.toString();
    }
    
    
    
    
    
}
