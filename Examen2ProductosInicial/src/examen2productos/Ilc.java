/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2productos;
import static examen2productos.Entrada.*;
import java.util.Scanner;

/**
 *
 * @author jnieto
 */
public class Ilc {
        /**
     * Realiza el reparto de la funcionalidad ler = lee, evalua, repite
     */
    public void ler() throws Exception {
        int op;

        int maxProductos = leeEntero("Num. max. productos: ") ;

        Almacen coleccion = new Almacen(maxProductos);

        do {
            System.out.println("\n-----------------------------------");
            System.out.println("Gestión de una clínica hospitalaria");

            op = menu();

            switch (op) {
                case 0:
                    System.out.println("Fin.");
                    break;
                case 1:
                    insertaProducto(coleccion);
                    break;
                case 2:
                    modificaProducto(coleccion);
                    break;
                case 3:
                    eliminaProducto(coleccion);
                    break;
                case 4:
                    System.out.println(coleccion);;
                    break;
                case 5:
                    System.out.println(coleccion.toString(leeTipoProducto2()));
                    break;
                default:
                    System.err.println("No es correcta esa opción (" + op + ")");
            }
        } while (op != 0);
    }

    /**
     * Presenta un menu con las opciones, y permite seleccionar una.
     *
     * @return la opcion seleccionada, como entero
     */
    private int menu() {
        int toret;

        do {
            System.out.println(
                    "\n1. Inserta un nuevo producto\n"
                    + "2. Modifica un producto\n"
                    + "3. Elimina un producto\n"
                    + "4. Listar productos\n"
                    + "5. Listar por tipo\n"
                    + "0. Salir\n");
            toret = leeEntero("Selecciona: ");
        } while (toret < 0
                && toret > 5);

        System.out.println();
        return toret;
    }

    /**
     * Crea un nuevo producto y lo inserta en la coleccion
     *
     * @param coleccion La coleccion en la que se inserta el producto.
     */
    private void insertaProducto(Almacen coleccion) throws Exception {
        System.out.println("\n-------------");
        System.out.println("\nAlta producto");

        Producto p = leeProducto();
        coleccion.inserta(p);
    }

    /**
     * Lee del teclado los datos de un producto.
     *
     * @return El objeto Producto creado
     */
    private Producto leeProducto() {
        System.out.println("\nIntroduce los datos del nuevo Producto:");

        
        String nombre = leeCadena("\tNombre: ");
        int cantidad = leeEntero("\tCantidad: ");
        int precio = leeEntero("\tPrecio: ");
        String codBarras = leeCadena("\tCodigo de Barras: ");
        Producto.TipoProducto tipoProducto = leeTipoProducto2();
        

        boolean esPrivado = tipoProducto.equals("P");

        return new Producto(nombre, cantidad, precio, tipoProducto, codBarras);
    }

    private String leeTipoProducto() {
        return leeTipoProducto("\tIntroduce el tipo de producto (K: Kilogramos, U: Unidades): ");
    }

    private String leeTipoProducto(String msg) {
        String tipoProducto = "";
        do {
            tipoProducto = leeCadena(msg);

            if (!tipoProducto.equals("K") && !tipoProducto.equals("U")) {
                System.err.println("El tipo de producto introducido no es válido. "
                        + "Por favor, introdúcelo de nuevo.");
            }
        } while (!tipoProducto.equals("K") && !tipoProducto.equals("U"));

        return tipoProducto;
    }
    
    private Producto.TipoProducto leeTipoProducto2() {
    
        Producto.TipoProducto ret;
        
        int op;
        
        do {
            
            System.out.println("\tTipo de producto: ");
            for (int i = 0; i < Producto.TipoProducto.values().length; i++) {
                
                System.out.println("\t " + (i + 1) + ". " + Producto.TipoProducto.values()[i].toString() + "\n");
                
            }
            
            op = Entrada.leeEntero("Introduzca el numero deseado: ");
        
        } while (op < 1 || op > Producto.TipoProducto.values().length);
        
        ret = Producto.TipoProducto.values()[op - 1];
        
        return ret;
    
    }

    /**
     * Borra un producto por su posicion en la colección.
     *
     * @param coleccion La coleccion en la que se elimina el producto
     */
    private void eliminaProducto(Almacen coleccion) {
        if (coleccion.getNumProductos() > 0) {
            coleccion.elimina(leePosProducto(coleccion));
        } else {
            System.out.println("La coleccion no contiene productos.");
        }
    }

    /**
     * Modifica un producto existente.
     *
     * @param coleccion La coleccion de la cual modificar un producto.
     */
    private void modificaProducto(Almacen coleccion) throws Exception {
        System.out.println("\n---------------------");
        System.out.println("\nModificación producto");

        if (coleccion.getNumProductos() > 0) {
            this.modificaProducto(coleccion.get(this.leePosProducto(coleccion)));
        } else {
            System.out.println("La coleccion no contiene productos.");
        }
    }
    private void modificaProducto(Producto p){
        System.out.println("Modificando Producto");
         System.out.println("\nModificando los datos del siguiente producto:");
        System.out.println(p);
        
        System.out.println(); String codBarras = leeCadena("\tNúmero de historial [" + p.getCodigoBarras() + "]: ", true);
        if (!codBarras.isEmpty()) {
            p.setCodigoBarras(codBarras);
        }
        String nombre = leeCadena("\tNombre [" + p.getNombre() + "]: ", true);
        if (!nombre.isEmpty()) {
            p.setNombre(nombre);
        }
        System.out.print("Tipo Producto: "+p.getTipoProducto());
        Producto.TipoProducto tipoProducto = leeTipoProducto2();
        
        p.setTipoProducto(tipoProducto);
       
        boolean cantValida = false;
        while (!cantValida) {
            String cant = leeCadena("\tCantidad [" + p.getCantidad() + "]: ", true);
            if (!cant.isEmpty()) {
                try {
                    int cant2 = Integer.parseInt(cant);
                    cantValida = true;
                    p.setCantidad(cant2);
                } catch (NumberFormatException e) {
                    System.err.println("La cadena introducida no se puede "
                            + "convertir a número entero. Por favor, "
                            + "introdúcela de nuevo.");
                }
            } else {
                cantValida = true;
            }
        }

        boolean precioValido = false;
        while (!precioValido) {
            String precio = leeCadena("\tPrecio [" + p.getPrecio() + "]: ", true);
            if (!precio.isEmpty()) {
                try {
                    int pre = Integer.parseInt(precio);
                    precioValido = true;
                    p.setPrecio(pre);
                } catch (NumberFormatException e) {
                    System.err.println("La cadena introducida no se puede "
                            + "convertir a número entero. Por favor, "
                            + "introdúcela de nuevo.");
                }
            } else {
                precioValido = true;
            }
        }

        
       
        
        
        
    }
/*
    private void modificaProducto(Producto p) {
        System.out.println("\nModificando los datos del siguiente producto:");
        System.out.println(p);
        System.out.println();

        String numHistorial = leeCadena("\tNúmero de historial [" + p.getNumHistorial() + "]: ", true);
        if (!numHistorial.isEmpty()) {
            p.setNumHistorial(numHistorial);
        }

        String nombre = leeCadena("\tNombre [" + p.getNombre() + "]: ", true);
        if (!nombre.isEmpty()) {
            p.setNombre(nombre);
        }

        String domicilio = leeCadena("\tDomicilio [" + p.getDomicilio() + "]: ", true);
        if (!domicilio.isEmpty()) {
            p.setDomicilio(domicilio);
        }

        boolean anoValido = false;
        while (!anoValido) {
            String anoStr = leeCadena("\tAno [" + p.getAno() + "]: ", true);
            if (!anoStr.isEmpty()) {
                try {
                    int ano = Integer.parseInt(anoStr);
                    anoValido = true;
                    p.setAno(ano);
                } catch (NumberFormatException e) {
                    System.err.println("La cadena introducida no se puede "
                            + "convertir a número entero. Por favor, "
                            + "introdúcela de nuevo.");
                }
            } else {
                anoValido = true;
            }
        }

        String tipoProductoActual = p.estaEtiquetadoComoAsegurado() ? "A" : "P";
        String tipoProducto = leeTipoProducto("\tIntroduce el tipo de producto (P: privado, A: asegurado) [" + tipoProductoActual + "]: ");
        boolean esPrivado = tipoProducto.equals("P");
        p.setEtiquetaPrivado(esPrivado);
    }
*/
    /**
     * Lee del teclado la posición de un producto en la colección
     *
     * @param coleccion La colección de la que se obtiene el max.
     * @return la posición del producto, como entero.
     */
    private int leePosProducto(Almacen coleccion) {
        final int numProductos = coleccion.getNumProductos();
        int toret;

        do {
            toret = leeEntero("Introduzca posición del producto (1..." + numProductos + "): ");

            if (toret < 1 || toret > numProductos) {
                System.err.println("Posición inválida. Por favor, introdúzcala de nuevo.");
            }
        } while (toret < 1 || toret > numProductos);

        return toret - 1;
    }
    
    

    /**
     * Visualiza los pacentes almacenados en la coleccion por la salida std.
     *
     * @param coleccion El objeto Almacen del que visualizar sus productos.
     */
    /* private void visualiza(Almacen coleccion) {
        final int numProductos = coleccion.getNumProductos();

        if (numProductos > 0) {
            for (int i = 0; i < numProductos; i++) {
                System.out.print((i + 1) + ". ");
                System.out.println(coleccion.get(i).toString());
                System.out.println("\n");
            }
        } else {
            System.out.println("No hay productos.");
        }

    } */
}
