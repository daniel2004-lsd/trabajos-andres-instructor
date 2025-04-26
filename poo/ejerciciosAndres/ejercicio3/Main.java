package ejerciciosAndres.ejercicio3;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeyNewton ley = null;

        System.out.println("Selecciona la ley de Newton:");
        System.out.println("1. Primera Ley (Inercia)");
        System.out.println("2. Segunda Ley (F = m * a)");
        System.out.println("3. Tercera Ley (Acción y Reacción)");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la fuerza neta (N): ");
                double fuerza1 = sc.nextDouble();
                ley = new PrimeraLey(fuerza1);
                break;
            case 2:
                System.out.print("Ingresa la masa (kg): ");
                double masa = sc.nextDouble();
                System.out.print("Ingresa la aceleración (m/s²): ");
                double aceleracion = sc.nextDouble();
                ley = new SegundaLey(masa, aceleracion);
                break;
            case 3:
                System.out.print("Ingresa la fuerza de acción (N): ");
                double fuerza3 = sc.nextDouble();
                ley = new TercerLey(fuerza3);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println(ley.explicarLey());
        System.out.println(ley.calcularLey());
    }
}
