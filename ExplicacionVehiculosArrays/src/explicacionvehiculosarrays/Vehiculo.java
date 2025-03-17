/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionvehiculosarrays;

/**
 *
 * @author jnieto
 */
public class Vehiculo {
    private String matricula;
    private String color;
    private String marca;

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }
    
    public boolean tieneMatricula(String m){
        return matricula.equalsIgnoreCase(m);
    }
    public boolean esColor(String c){
        return (color.indexOf(c)!=-1);
    }
    

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", color=" + color + ", marca=" + marca + '}';
    }
    
    
    
}
