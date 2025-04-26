package ejerciciosAndres.ejercicio3;

public class TercerLey extends LeyNewton {
    private double fuerza;

    public TercerLey(double fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String explicarLey() {
        return "Tercera Ley de Newton: A toda acción corresponde una reacción de igual magnitud y en sentido opuesto.";
    }

    @Override
    public String calcularLey() {
        return "La fuerza de reacción es de: " + (-fuerza) + " N (opuesta a la fuerza de acción).";
    }
}
