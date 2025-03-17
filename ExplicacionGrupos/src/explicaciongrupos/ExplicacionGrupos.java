/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciongrupos;

/**
 *
 * @author dual109
 */
public class ExplicacionGrupos {

    public static void testAlumnos() {
    
        Alumnos a1;
        
        System.out.println("Numero de alumnos: " + Alumnos.getTotalAlumnos());
                
        a1 = new Alumnos("Primero",1001);
        
        System.out.println("Depues de crear el ojeto");
        
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println(Alumnos.getTotalAlumnos());
        
        Alumnos a2 = new Alumnos("Segundo", 1002);
    
        System.out.println(a2);
        System.out.println(a2.toString());
        System.out.println(Alumnos.getTotalAlumnos());
    
    }
    
    public static void testGrupos() {
    
        System.out.println("Test de grupos");
        Grupo g = new Grupo("DAW dual", 12);
        g.insertarAlumno(new Alumnos("1",1));
        g.insertarAlumno(new Alumnos("2",2));
        g.insertarAlumno(new Alumnos("3",3));
        g.insertarAlumno(new Alumnos("4",4));
        g.insertarAlumno(new Alumnos("5",5));
        
        System.out.println("Recibir alumno por id");
        System.out.println(g.getPorId(4));
        System.out.println(g.getPorId(3));
        System.out.println(g.getPorId(23));
        System.out.println("Listar");
        System.out.println(g);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        testGrupos();
        testAlumnos();
        
        
    }
    
}
