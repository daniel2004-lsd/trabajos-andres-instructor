package ejerciciosAndres.ejercicio1;

public class Main {
    public static void main(String[] args) {
        //new es el constructor que crea la instancia con sus datos 
        Persona persona = new Persona("Carlos", 200000, 50); // Persona proviene de la clase y persona es la instancia (osea el objeto)
        Descuentos descuentos = new Descuentos(0.04, 0.04, 0.01); // salud, pensión, AR
        Estras extras = new Estras(20, 2, 10, 7500);
        SueldoFinal calculadora = new SueldoFinal();
        calculadora.calcularTotal(persona, descuentos, extras);
        persona.calcularSueldo();
        

        //Se llama al método calcularTotal, pasándole el objeto persona y los descuentos.
        
        System.out.println("..................................................");
        System.out.println("PERSONA");
        
    }
    /*Calcula el sueldo base (valorDía * díasTrabajados).
    luego Aplica los descuentos (salud, pensión, ARL).
    Aplica subsidio de transporte si el sueldo base es menor o igual a dos salarios mínimos.
    Muestra en consola el resultado final. */
}
