/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopeluqueria;
import static ejerciciopeluqueria.Entrada.*;

/**
 *
 * @author dual109
 */
public class Funciones {
    
    //funciones del menu
    
    public void leer() {
    
        int op;
        
        int maxClientes = leeEntero("Numero maximo de clientes");
        
        Peluquerias p1 = new Peluquerias(maxClientes);
        
        do {
        
            System.out.println("Clientes: " + p1.getNumClientes() + "/" + p1.getMaxClientes());
            System.out.println("\n-----------------------");
            System.out.println("Gestion de una peluqueria");
            
            op = menu(p1);
            try {
                switch(op) {
                    case 0:
                        System.out.println("Fin.");
                        break;
                    case 1:
                        insertaCliente(p1);
                        break;
                    case 2:
                        eliminaCliente(p1);
                        break;
                    case 3:
                        System.out.println(p1);
                        break;
                    default:
                        System.err.println("No es correcta esa opcion");
                            
                }
                        
            } catch (Exception ex) {
                
                System.err.println("Error: " + ex.getMessage());
            
            }
            
        } while (op != 0);
    
    }
    
    private int menu(Peluquerias p) {
        
        int toret;
        
        do {
            
            System.out.println("Clientes: " + p.getNumClientes() + "/" + p.getMaxClientes());
            System.out.println(
                    "\n1. Inserta un nuevo cliente"
                    + "\n2. Elimina un cliente"
                    + "\n3. Muestra los clientes"
                    + "\n0. Salir\n");
            
            toret = leeEntero("Selecciona: ");
          
                   
        } while (toret <0 && toret > 5);
        
        System.out.println();
        return toret;
        
    }
    
    
    public void insertaCliente(Peluquerias p1) throws Exception {
                       
                
        final int maxClientes = p1.getMaxClientes();
        
        if (p1.getNumClientes() >= maxClientes) {
            
            throw new Exception ("No se pueden añadir mas clientes, la peluqueria esta llena");
            
        }
        
        System.out.println("\n-------------");
        System.out.println("\nAlta de cliente");
        
        Clientes c = leeCliente();
        p1.inserta(c);
        
    
    }
    
    public Clientes leeCliente() throws Exception {
    
        System.out.println("\n Introduce los datos del nuevo cliente");
        
        String nombre = leeCadena("\nNombre: ");
        int dni = leeEntero("\nDni: ");
        
        if (p1.existeCliente(dni)) {
        
            throw new Exception ("No se puede añadir cliente por que ya existe");
        
            }
        
        return new Clientes(nombre, dni);
        
    }
    
    public void eliminaCliente(Peluquerias p1) throws Exception {
        
        System.out.println("\n----------");
        int eliminaDni = leeEntero("\nEspecifica el dni del cliente a eliminar: ");
        
        p1.elimina(eliminaDni);
    
    
    }
    
    
    
}
