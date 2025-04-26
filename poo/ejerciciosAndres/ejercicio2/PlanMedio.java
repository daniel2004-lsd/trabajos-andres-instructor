public class PlanMedio extends Plan{
    public PlanMedio(){
        super("Plan medio" , 50000);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Plan: " + getNombre());
        System.out.println("Costo: " + getCosto());
        System.out.println("servicios: incluye clases dirigidas");
    }
}
