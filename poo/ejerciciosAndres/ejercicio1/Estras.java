package ejerciciosAndres.ejercicio1;

public class Estras {
    private double horasDiurnas;
    private double horasNocturnas;
    private double horasFestivos;
    private double valorHora;


    public double getHorasDiurnas() {
        return horasDiurnas;
    }


    public void setHorasDiurnas(double horasDiurnas) {
        this.horasDiurnas = horasDiurnas;
    }


    public double getHorasNocturnas() {
        return horasNocturnas;
    }


    public void setHorasNocturnas(double horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }


    public double getHorasFestivos() {
        return horasFestivos;
    }


    public void setHorasFestivos(double horasFestivos) {
        this.horasFestivos = horasFestivos;
    }


    public Estras(double horasDiurnas, double horasNocturnas, double horasFestivos, double valorHora) {
        this.horasDiurnas = horasDiurnas;
        this.horasNocturnas = horasNocturnas;
        this.horasFestivos = horasFestivos;
        this.valorHora = valorHora;
    }

    public double calcularPagoHorasExtra(){
        double pagoDiurnas = horasDiurnas * valorHora * 1.25;
        double pagoNocturnas = horasNocturnas * valorHora * 1.75;
        double pagoFestivas = horasFestivos * valorHora * 2.00;
        
        return pagoDiurnas + pagoNocturnas + pagoFestivas;
    }

}

