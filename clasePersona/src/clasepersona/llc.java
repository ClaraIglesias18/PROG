/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersona;

/**
 *
 * @author dual109
 */
public class llc {
    
    public void creaPersona() {
    
        int op;
        int n = 0;
        
        do {
            
            System.out.println("Gestionde un instituto");
            System.out.println("\n------------------");
            
            op = menu();
            
            try {
                
                switch (op) {
                    
                    case 0:
                        System.out.println("Fin");
                        break;
                    case 1:
                        nuevaPersona();
                        n++;
                        break;
                    default:
                        System.err.println("No es correcta esa opcion");
                
                }
            
            } catch (Exception ex) {
            
                    System.err.println("Error: " + ex.getMessage());
                
                }
            
        } while (op != 0);
                    
        
    }
    
    public int menu () {
    
    int op;    
        
    do {
    
        System.out.println(
                "\n1.Crea una nueva persona"
                + "\n0. Salir");
        
        op = Entrada.leeEntero("Selecciona una opcion: ");
    
    } while (op < 0 && op > 1);
    
    System.out.println("");
    
    return op;
    
    }
    
    public void nuevaPersona() {
    
        System.out.println("\n--------------");
        System.out.println("Escribe los datos de la nueva persona");
        
        String nombre = Entrada.leeCadena("Nombre: ");
        String dni = Entrada.leeCadena("Dni: ");
        
        String eleccion;
        
        do {
            
            eleccion = Entrada.leeCadena("Indique si es un profesor o un alumno (P / A)");
            System.out.println("\n-----------------");
                                    
        } while (!eleccion.equals("p") || !eleccion.equals("P") || !eleccion.equals("A") || !eleccion.equals("a"));
        
        if (eleccion.equals("p") || eleccion.equals("P")) {
        
            String despacho = Entrada.leeCadena("Despacho: ");
            String asignatura = Entrada.leeCadena("Asignatura: ");
            
            Profesor n = new Profesor(nombre, dni, despacho, asignatura);
            
            System.out.println(n);
            
        } else {
        
            String planEstudios = Entrada.leeCadena("Plan de estudios: ");
            
            Alumno n = new Alumno(nombre, dni, planEstudios);
            
            System.out.println(n);
            
        
        }
        
        
    
    }
    
}
