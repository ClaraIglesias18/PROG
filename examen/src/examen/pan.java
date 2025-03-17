/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author dual109
 */
public class pan {
    
    private String nombre;
    private String direccion;
    private String tipo;
    private double coste;
    private int unidadesFabricadas;
    private int unidadesVendidas;
    private double precio;
    
    public pan() {
    
    
    }
    
    public pan(String nombre, String direccion, String tipo, double coste, double precio, int unidadesFabricadas) {
    
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.coste = coste;
        this.precio = precio;
        this.unidadesFabricadas = unidadesFabricadas;
        
    }
    
    public void vender(int unidadesV) {
    
        unidadesVendidas = unidadesV + unidadesVendidas;
    
    }
    
    public void fabricar(int unidadesF) {
    
        unidadesFabricadas = unidadesF + unidadesFabricadas;
    
    }
    
    public void calcularBeneficio() {
    
        double costesTotales;
        costesTotales = unidadesFabricadas * coste;
        
        double gananciasTotales;
        gananciasTotales = unidadesVendidas * precio;
        
        double beneficio = gananciasTotales - costesTotales;
                
        System.out.println(beneficio);
        
    }
    
    public void visualiza() {
    
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(tipo);
        System.out.println(coste);
        System.out.println(precio);
        System.out.println(unidadesFabricadas);
        System.out.println(unidadesVendidas);
    
    }
    
    public static void main(String[] args) {
    
        pan pan1 = new pan("bueno", "valle","clasico", 20, 30, 90);
        pan1.visualiza();
        
        System.out.println("");
        
        pan1.fabricar(90);
        pan1.vender(50);
        
        
        pan1.calcularBeneficio();
        System.out.println("");
        pan1.visualiza();
    
    }
    
}
