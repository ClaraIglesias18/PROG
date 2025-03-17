/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosreusables;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class Entrada {
    
    /**
     * Lee una cadena del teclado
     * 
     * @param mensaje literal que especifica lo que el usuario debe introducir
     * @return  String cadena leida del teclado
     */
    
    public static String leeCadena(String mensaje) {
    
        return leeCadena(mensaje, false);
    
    }
    
    /**
     * Lee una cadena del teclado
     * 
     * @param mensaje Literal que especifica lo que el usuario debe introducir
     * @param permiteVacia
     * @return String cadeba leida del teclado
     */
    
    public static String leeCadena(String mensaje, boolean permiteVacia) {
    
        String leer;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            
            System.out.println(mensaje);
            
            leer = scanner.nextLine().trim();
            
            if (!permiteVacia && leer.length() == 0) {
                
                System.err.println("La cadena introducida no puede estar vacia. "
                                    + "Por favor, introducela de nuevo");
            
            } 
            
        }while ((permiteVacia == false) && leer.length() == 0);
            
            return leer;
        
        }
    
    /**
     * Lee un numero entero de teclado, mostrado un mensaje que indica lo que
     * el usuario debe introducir
     * 
     * @param msg el mensaje que va a visualizar
     * @return el numero, como entero
     */
    
    public static int leeEntero (String msg) {
        
        boolean esValido = false;
        int toret = 0;
        Scanner teclado = new Scanner(System.in);
        
        do {
            
            System.out.println(msg);
            
            try {
                
                toret = Integer.parseInt(teclado.nextLine());
                esValido = true;
            
            } catch (NumberFormatException exc) {
            
                System.err.println("La cadeba introducida no se puede "
                                    + "convertir a numero entero. Por favor, "
                                    + "introducela de nuevo. ");
            
            }
        
        } while (!esValido);
        
        return toret;
    
    
    }
        
    }
    

