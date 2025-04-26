package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Daniel", 18);
        System.out.print(persona.saludar());
        System.out.println(persona.esMayorEdad());
    }
}
