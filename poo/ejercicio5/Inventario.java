package ejercicio5;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos; // Solo la clase Inventario puede acceder directamente a esta lista.

    public Inventario() {
        productos = new ArrayList<>(); // esto es un constructor Cada vez que creas un objeto Inventario, se inicializa
                                       // la lista vacía.
    }

    /**
     * Agrega un producto al inventario.
     *
     * @param producto El producto que se desea agregar a la lista de productos.
     */
    public void agregarPrducto(Producto producto) {
        productos.add(producto);
    }

    public void listaProductos() {
        if (productos.isEmpty()) { // verifica si la lista esta vacia
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) { // V¿Producto → es el tipo de dato, en este caso una clase (una entidad). y
                                           // producto → es el nombre de la variable que representa un objeto de tipo
                                           // Producto.
                System.out.println(p);
            }
        }
    }

    public void buscarProducto(String nombre) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getName().equalsIgnoreCase(nombre)) {
                System.out.println("producto enontrado " + p);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("producto no encontrado");
        }
    }

}
