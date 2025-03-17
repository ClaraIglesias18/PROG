/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionjuegoarmas;

/**
 *
 * @author jnieto
 */
public class Arma {
    private String nombre;
    private int alcance;
    private int area;
    private int cantMunicion;
    private int daño;

    public Arma(String nombre, int alcance, int area, int cantMunicion,int daño) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.area = area;
        this.cantMunicion = cantMunicion;
        this.daño=daño;
    }
    
    public boolean dispara(){
        boolean ret= false;
        
        if (cantMunicion>0){
            ret=true;
            --cantMunicion;
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", alcance=" + alcance + ", area=" + area + ", cantMunicion=" + cantMunicion + '}';
    }
    
    
    
}
