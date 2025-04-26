package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("Mouse", 45000, 10);
        Producto p2 = new Producto("Teclado", 70000, 5);
        Producto p3 = new Producto("Monitor", 250000, 2);

        inventario.agregarPrducto(p1);
        inventario.agregarPrducto(p2);
        inventario.agregarPrducto(p3);

        System.out.println("📦 Productos en inventario:");
        inventario.listaProductos();

        System.out.println("\n🔎 Buscar producto:");
        inventario.buscarProducto("Teclado");

        System.out.println("\n🔎 Buscar producto inexistente:");
        inventario.buscarProducto("Celular");
    }
}
