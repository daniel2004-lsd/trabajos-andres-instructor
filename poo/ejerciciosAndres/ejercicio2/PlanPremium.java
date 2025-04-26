public class PlanPremium extends Plan{
    public PlanPremium(){
        super("Premium",100000);
    }
    public void mostrarInformacion(){
        System.out.println("Plan: " + getNombre());
        System.out.println("Costo: " + getCosto());
        System.out.println("Servicios:  Todos los beneficios + entrenador personal.");
    }
}
