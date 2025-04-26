package ejerciciosAndres.ejercicio3;

public class SegundaLey extends LeyNewton {
    private double masa;
    private double aceleracion;

    public SegundaLey(double masa, double aceleracion) {
        this.masa = masa;
        this.aceleracion = aceleracion;
    }

    @Override
    public String explicarLey() {
        return "Segunda Ley de Newton: La fuerza que actúa sobre un objeto es igual al producto de su masa y su aceleración (F = m * a).";
    }

    @Override
    public String calcularLey() {
        double fuerza = masa * aceleracion;
        return "la fuerza calculad es: " + fuerza + " N.";
    }
}
