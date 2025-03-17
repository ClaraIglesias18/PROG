/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author dual109
 */
public class Menu {
    
    public static Scanner leer = new Scanner(System.in);
    
    public static void mostrar() {
    
        System.out.println("MENU");
        System.out.println("1. Alta de clientes");
        System.out.println("2. Consulta de clientes");
        System.out.println("3. Alta de cuentas");
        System.out.println("4. Consulta de cuentas");
        System.out.println("5. Salir");
        
    }
    
    public static Cliente altaCliente() {
    
        String nombre, apellido1, apellido2;
        int direccion, dni;
        
        System.out.println("Nombre: ");
        nombre = leer.nextLine();
        System.out.println("Apellido1: ");
        apellido1 = leer.nextLine();
        System.out.println("Apellido2: ");
        apellido2 = leer.nextLine();
        System.out.println("Direccion: ");
        leer.nextLine();
        direccion = leer.nextInt();
        System.out.println("Dni: ");
        dni = leer.nextInt();
        
        return new Cliente(nombre, apellido1, apellido2, dni, direccion);
        
    }
    
    public static Cuenta altaCuenta() {
    
        double saldo;
        
        System.out.println("Saldo inicial: ");
        saldo = leer.nextDouble();
                
        return new Cuenta(altaCliente(), saldo);
    }
    
}
