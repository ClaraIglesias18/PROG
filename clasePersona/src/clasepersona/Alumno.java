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
public class Alumno extends Persona{
    
    private String planEstudios;
    
    public Alumno (String planEstudios, String dni, String nombre) {
        
        super(dni, nombre);
        
        if (planEstudios.isBlank()) {
        
            throw new IllegalArgumentException("El campo planEstudios no puede estar vacio");
        
        }
            
    }

    public String getPlanEstudios() {
        
        return planEstudios;
    
    }

    public void setPlanEstudios(String planEstudios) {
    
        this.planEstudios = planEstudios;
    
    }

    @Override
    public String toString() {
        
        StringBuilder ret = new StringBuilder();
        ret.append(super.toString());
        ret.append("\n\tPlan de estudios: ").append(planEstudios);
        
        return ret.toString();
    }
    
    

}


