/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio114;

import java.util.Calendar;

/**
 *
 * @author jnieto
 */
public class Cliente{
    public static enum Sexo  {H,M};
    private static String [][] indice = {
        {"15 o menos","Delgadez muy severa"},
        {"15-15.9","Delgadez severa"},
        {"16-18.4","Delgadez"},
        {"18.5-24.9","Peso saludable"},
        {"25-29.9","Sobrepeso"},
        {"30-34.9","Obesidad Moderada"},
        {"35-39.9","Obesidad Severa"},
        {"40 o más","Obesidad muy servera(obesidad mórbida)"}
    };
    private String nombre;
    private int anhoN;
    private String nif;
    private Sexo sexo;
    private int peso;
    private int altura;

    public Cliente() {
    }
    
    public Cliente(String nombre, int anhoN, String nif, Sexo sexo, int peso, int altura) throws OutOfRangeException{
        this.nombre = nombre;
        this.anhoN = anhoN;
        this.nif = nif;
        this.sexo = sexo;
        setPeso(peso);
        setAltura(altura);
    }

    
    /**
     * Función para calcular si el usuario es mayor de edad
     * @return True si es mayor de edad, False en otro caso
     */
    public boolean esMayorDeEdad(){
        return (getEdad()>=18);
    }
    
    /**
     * Establece el peso en kg del usuario que debe estar comprendido entre 15 y 180 kg
     * @param peso peso en kg 
     * @throws OutOfRangeException si está fuera del intervalo 15-180 extremos incluídos
     */
    private  void setPeso(int peso)throws OutOfRangeException {
        if (peso<15 || peso > 180) throw new OutOfRangeException("El peso debe tener un valor entre 15 y 180");
        this.peso=peso;
    }
    /**
     * Retorna la edad del usuario
     * @return un entero que representa edad: año actual - nacimiento
     */
    public int getEdad(){
        return(Calendar.getInstance().get(Calendar.YEAR)-anhoN);
    }

    /**
     * Establece la altura en cm del usuario, debe estar comprendida entre 110 y 225
     * @param altura en cm del usuario
     * @throws OutOfRangeException si está fuera del rango 110-225 extremos incluídos
     */
    public void setAltura(int altura) throws OutOfRangeException {
        
        if (altura<110 || altura > 225) throw new OutOfRangeException("La altura debe estar entre 110 cm y 225 cm");
        
        this.altura = altura;
    }
    
    /**Calcula y devuelve el IMC del usuario actual
     * 
     * @return indice de masa corporal del usuario
     */
    public double getIndice(){
        
        return (peso/Math.pow(altura/100,2));
    }
    /**
     * Devuelve el rango (fila) del índice de masa corporal en el array
     * @return fila del array
     */
    private int getFila(){
        double imc=getIndice();
        int ret;
        
        if (imc<=15) ret=0;
        else if (imc<=15.9) ret=1;
        else if (imc<=18.4) ret=2;
        else if (imc<=24.9) ret=3;
        else if (imc<=29.9) ret=4;
        else if (imc<=34.9) ret=5;
        else if (imc<=39.9) ret=6;
        else ret=7;
            
        return ret;
    }
    
    public String getIndiceYRango(){
        StringBuilder ret;
        Double imc;
        int fila;
        
        imc=getIndice();
        fila=getFila();
        
        ret=new StringBuilder("IMC: "+imc);
        
        
        ret.append("\t"+indice[fila][0]+"\t "+indice[fila][1]);
        
        return(ret.toString());
    }

    
    
    
}
