package ejercicio7;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("DANIEL", 3.3);
        Estudiante estudiante1 = new Estudiante("DANIEL", 1.0);
        System.out.println(estudiante.esAprobado());
        estudiante.mostrarDatos();
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println(estudiante1.esAprobado());
        estudiante1.mostrarDatos();

        
    }
}
