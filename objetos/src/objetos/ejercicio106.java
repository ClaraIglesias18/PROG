/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author clara
 */
public class ejercicio106 {
    
    public String nombre;
    public String nif;
    public double altura;
    public double peso;
    public int edad;
    
    public ejercicio106() {
    
    
    
    }
    
    public ejercicio106(String nombre, String nif, double altura, double peso, int edad) {
    
        this.altura = altura;
        this.edad = edad;
        this.nif = nif;
        this.nombre = nombre;
        this.peso = peso;
    
    }
    
    public void visualiza() {
    
        System.out.println("Nombre: " + nombre);
        System.out.println("NIF: " + nif);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        
        if(edad >= 18) {
        
            System.out.println("Mayor de edad");
        
        } else System.out.println("Menor de edad");
    
    }
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("NIF: ");
        String nif = leer.nextLine();
        
        System.out.println("Altura: ");
        double altura = leer.nextDouble();
        
        System.out.println("Peso: ");
        double peso = leer.nextDouble();
        
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        
        ejercicio106 clara = new ejercicio106(nombre, nif, altura, peso, edad);
        clara.visualiza();
    
    
    }
    
}
