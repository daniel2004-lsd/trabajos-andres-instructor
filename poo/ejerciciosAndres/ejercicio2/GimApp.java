import java.util.*;  // Importa las clases necesarias para trabajar con listas y escáner


public class GimApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario
        List<Usuario> usuarios = new ArrayList<>();  // Crea una lista para almacenar los usuarios registrados

        String continuar;  // Variable para controlar si se desea registrar más usuarios

        // Bucle para permitir registrar varios usuarios
        do {
            System.out.println("\n--- Registro de Usuario ---");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();  // Lee el nombre del usuario

            System.out.print("Edad: ");
            int edad = scanner.nextInt();  // Lee la edad del usuario

            System.out.println("Seleccione un plan:");
            System.out.println("1. Básico");
            System.out.println("2. Medio");
            System.out.println("3. Premium");
            int opcion = scanner.nextInt();  // Lee la opción de plan seleccionada
            scanner.nextLine();  // Limpia el buffer de la entrada

            Plan plan;  // Declara una variable de tipo Plan para almacenar el plan elegido

            // Según la opción seleccionada, asigna el plan correspondiente
            switch (opcion) {
                case 1 -> plan = new PlanBasico();  // Si elige el plan básico
                case 2 -> plan = new PlanMedio();   // Si elige el plan medio
                case 3 -> plan = new PlanPremium(); // Si elige el plan premium
                default -> {  // Si se ingresa una opción inválida
                    System.out.println("Opción inválida. Se asignará el plan básico.");
                    plan = new PlanBasico();  // Se asigna el plan básico por defecto
                }
            }

            Usuario usuario = new Usuario(nombre, edad, plan);  // Crea un nuevo objeto Usuario con los datos proporcionados
            usuarios.add(usuario);  // Añade el usuario a la lista de usuarios

            System.out.print("\n¿Desea registrar otro usuario? (s/n): ");
            continuar = scanner.nextLine();  // Pregunta si desea registrar otro usuario

        } while (continuar.equalsIgnoreCase("s"));  // Si el usuario responde 's', continúa el bucle

        // Muestra la lista de todos los usuarios registrados
        System.out.println("\n==== LISTA DE USUARIOS REGISTRADOS ====");
        for (Usuario u : usuarios) {
            u.mostrarInformacionUsuario();  // Muestra la información de cada usuario
        }

        scanner.close();  // Cierra el objeto Scanner para liberar recursos
    }
    }

