/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author dual109
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    
    public static Cliente pruebaCliente() {
    
        Cliente c1 = new Cliente("Clara", "Iglesias", "Vazquez", 4516499, 32004);
        Cliente c2 = new Cliente("pepe", "gonzalez", "perez", 45124399, 32005);
        
        
        System.out.println(c1);
        System.out.println(c2);
        
        return c2;
    
    }
    
    public static void pruebaCuenta() {
    
        Cuenta cuenta1 = new Cuenta(pruebaCliente(), 1000);
        
        System.out.println(cuenta1);
        System.out.println(cuenta1.ingresar(134545));
        System.out.println(cuenta1.retirar(2423));
        System.out.println(cuenta1.retirar(-2423));
        System.out.println(cuenta1.ingresar(-2423));
        System.out.println(cuenta1);
        
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op = 0;
        
        Cliente [] clientes = new Cliente[25];
        int ncliente = 0, ncuenta = 0;
        Cuenta [] cuentas = new Cuenta[25];
        
        while (op != 5) {
                
            Menu.mostrar();
            op = Menu.leer.nextInt();
            Menu.leer.nextLine();
            switch (op) {
            
                case 1:
                    
                    if (ncliente < 25) {
                        
                        clientes[ncliente++] = Menu.altaCliente();
                        ++ncliente;
                    }
                    break;
                
                case 3:
                    
                    if (ncuenta < 25) {
                    
                        cuentas[ncuenta++] = Menu.altaCuenta();
                        ++ncuenta;
                    }
                    break;
            
            
            }
            
        }
        
        
        
    }
    
}
