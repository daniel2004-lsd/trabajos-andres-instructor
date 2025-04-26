public class PlanBasico extends Plan {
    public PlanBasico(){
        super("Basico", 30000); // llama al constructor de la clase base la cual es Plan!
    }
    @Override
    public void mostrarInformacion(){ // este metodo se hereda de la clase Plan
        System.out.println("Plan: " + getNombre());
        System.out.println("Costo: " + getCosto());
        System.out.println("Servicios: acceso general");
    }
}
