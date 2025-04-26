package ejerciciosAndres.ejercicio4;

import java.util.*;

public class ceaNeiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiantes> estudiantes = new ArrayList<>();
        String continuar;

        do {
            System.out.println(".....NUEVO ESTUDIANTE.......");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Teléfono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("RH: ");
            String rh = scanner.nextLine();

            System.out.println("\nSELECCIONA EL TIPO DE LICENCIA QUE DESEAS:");
            System.out.println("1. CATEGORÍA A");
            System.out.println("2. CATEGORÍA B");
            System.out.println("3. CATEGORÍA C");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            Licencias licencias;
            switch (opcion) {
                case 1 -> licencias = new CategoriaA();
                case 2 -> licencias = new CategoriaB();
                case 3 -> licencias = new CategoriaC();
                default -> {
                    System.out.println("Número inválido. Por defecto se seleccionará categoría A");
                    licencias = new CategoriaA();
                }
            }

            // Crear y agregar estudiante
            Estudiantes estudiante = new Estudiantes(nombre, apellido, edad, direccion, telefono, rh, licencias);
            estudiantes.add(estudiante);

            System.out.print("\n¿Desea registrar otro usuario? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar estudiantes registrados
        System.out.println("\n--- ESTUDIANTES REGISTRADOS ---");
        for (Estudiantes e : estudiantes) {
            e.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }
}
