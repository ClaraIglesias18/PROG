/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author clara
 */
public class Medico extends Persona{
    private Paciente pacientes[];
    public static enum Especialidad{CARDIOLOGIA, PEDIATRIA, TRAUMATOLOGIA, NEUROCIRUGIA, DERMATOLOGIA}
    private Especialidad esp;
    private int numPacientes = 0;
        
    /**
     * creacion de medico mas su numero maximo de pacientes por medico 5
     * @param nombre
     * @param apellido
     * @param ano
     * @param esp 
     */
    
    public Medico(String nombre, String apellido, int ano, Especialidad esp) {
        
        super(nombre.trim(), apellido.trim(), ano);
        this.esp = esp;
        pacientes = new Paciente[5];
               
                
    }
    
    public Especialidad getEsp() {
    
        return esp;
    
    }
    
        
    //inserta paciente
    
    public void insertaPaciente(Paciente paciente) throws ArrayIndexOutOfBoundsException {
    
        if (numPacientes == 5) {
        
            throw new ArrayIndexOutOfBoundsException("El numero de pacientes para ese medico esta completo");
            
        }
        
        pacientes[numPacientes] = paciente;
        numPacientes++;
       
               
    }
    
    //elimina paciente
    
    public void eliminaPaciente(int pos) throws Exception {
    
        if (pos > numPacientes) {
        
            throw new Exception("El codigo no corresponde con ningun paciente");
        
        }
        
        for (int i = pos; i < numPacientes; i++) {
            
            if (i == numPacientes) {
            
                pacientes[i] = null;
            
            } else {
            
                pacientes[i] = pacientes[i+1];
                
            }
            
        }
        
        --numPacientes;
    
    }
    
    //consulta pacientes
    
    

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        
        ret.append(super.toString());
        ret.append("\n\tEspecialidad: ").append(esp);
        ret.append("\n\tNumero de pacientes: ");
        
        for (int i = 0; i < numPacientes; i++) {
            
            ret.append(pacientes[i]);
            
        }
              
        return ret.toString();
    }
}
