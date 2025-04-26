package ejerciciosAndres.ejercicio1;
public class Descuentos {
    private double porcentajeSalud;
    private double porcentajesPension;
    private double porcentajeArl;

    
    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }


    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }


    public double getPorcentajesPension() {
        return porcentajesPension;
    }


    public void setPorcentajesPension(double porcentajesPension) {
        this.porcentajesPension = porcentajesPension;
    }


    public double getPorcentajeArl() {
        return porcentajeArl;
    }


    public void setPorcentajeArl(double porcentajeArl) {
        this.porcentajeArl = porcentajeArl;
    }


    public Descuentos(double porcentajeSalud, double porcentajesPension, double porcentajeArl) {
        this.porcentajeSalud = porcentajeSalud;
        this.porcentajesPension = porcentajesPension;
        this.porcentajeArl = porcentajeArl;
    }

    public double calcularSalud(double sueldo){
        return sueldo * porcentajeSalud;
    }
    public double calcularArl(double sueldo){
        return sueldo * porcentajeArl;
    }
    public double calcularPension(double sueldo){
        return sueldo * porcentajesPension;
    }
}

