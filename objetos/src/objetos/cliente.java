/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Random;

/**
 *
 * @author dual109
 */
public class cliente {
    
    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private double peso;
    private double altura;
    
    public cliente() {       
    
    }
    
    public cliente(String nombre, int edad, String nif, char sexo, double peso, double altura) {
    
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.nif = nif;
        this.peso = peso;
        this.sexo = sexo;
        
    }
    
    public cliente (String nombre, int edad) {
    
        this.nombre = nombre;
        this.edad = edad;
        altura = (new Random()).nextInt(115)+110;
        nif = generaNIF();
        sexo = calcularSexoAleatorio();
        peso = (new Random()).nextInt(165)+15;
        
        
    }
    
    private char calcularSexoAleatorio() {
    
        Random al = new Random();
        int num;
        char ret;
        
        num = al.nextInt();
        
        if (num == 0) {
        
            ret = 'H';
                    
        } else if (num == 1) {
        
            ret = 'F';
        
        } else ret = 'O';
        
        return ret;
        
    
    }
    
        
    public void imc() {
        
               
        double imc;
        imc = peso / ((altura/100) * (altura/100));
        
        if (imc <= 15) {
            
            System.out.println("delgadez muy severa");;
        
        } else if (imc > 15 && imc <= 15.9) {
        
            System.out.println("delgadez  sever");
        
        } else if (imc >= 16 && imc <= 18.4) {
            
            System.out.println("deslgadez");
        
        } else if (imc >= 18.5 && imc <= 24.9) {
        
            System.out.println("Peso saludable");
            
        } else if (imc >= 25 && imc <= 29.9) {
        
            System.out.println("Sobrepeso");
        
        } else if (imc >= 30 && imc <= 34.9) {
        
            System.out.println("Obesidad moderada");
        
        } else if (imc >= 35 && imc <= 39.9) {
        
            System.out.println("Obesidad severa");
        
        } else if (imc >= 40) {
        
            System.out.println("Obesidad muy severa");
        
        }
        
        
    }
    
    public void esMayorDeEdad() {
                   
        if (edad >= 18 ) {
        
            System.out.println("Es mayor de 18");
        
        } else System.out.println("Es menor de 18");
        
    }
    
    private String generaNIF() {
    
        // 1º numero azar comprendido entre 1 y 9
        // resto comprendido etre 0 y 9
        // dividir numeros entre 23
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        // T R W A G M Y F P D X B N J Z S Q V H L C K E
        
        int suma = 0;
        
        int num1 = (int)(Math.random() * 10);
                
        int nif = num1;
        suma = suma + nif;
        
        for (int i = 0; i < 7; i++) {
            
            nif = nif * 10;
            int num = (int)(Math.random() * 10 + 1);
            
            while(num >= 10) {
            
                num = (int)(Math.random() * 10 + 1);
                
            }
            
            suma = suma + num;
            nif = nif + num;
            
            
        }
                       
        String letra[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int rest = suma / 23;
        
        String conver = letra[rest];
        
        
              
        return (String.format("%d%s", nif, conver));
        
    }
    
    public void visualiza() {
    
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(sexo);
        System.out.println(nif);
        System.out.println(peso);
        System.out.println(altura);
    
    }
    
    public static void main(String args[]) {
    
        cliente uno = new cliente("Clara", 21);
        cliente dos = new cliente("Pepe", 10, "45164991Y", 'M', 80, 190);
        
        uno.visualiza();
        System.out.println("");
        uno.esMayorDeEdad();
        System.out.println("");
        uno.imc();
        System.out.println("");
        dos.visualiza();
        System.out.println("");
        dos.esMayorDeEdad();
        System.out.println("");
        dos.imc();
                
    }
       
}
