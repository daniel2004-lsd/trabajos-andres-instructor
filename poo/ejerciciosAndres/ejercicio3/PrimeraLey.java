package ejerciciosAndres.ejercicio3;

public class PrimeraLey extends LeyNewton {
    private double fuerza;

    public PrimeraLey(double fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String explicarLey() {
        return "Primera Ley de Newton: Si la fuerza neta sobre un objeto es cero, el objeto mantiene su estado de movimiento (reposo o movimiento uniforme).";
    }

    @Override
    public String calcularLey() {
        if (fuerza == 0) {
            return "la fuerza es cero porque el objeto mantiene su estado de movimiento ";
        } else {
            return "la fuerza no es cero porque el objeto cambiara el estado de movimiento";
        }
    }
}
