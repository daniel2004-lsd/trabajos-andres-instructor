package ejerciciosAndres.ejercicio1;

public class HrExtras {
    private double horaDiurna;
    private double horaNocturna;
    private double horaFestivas;
    private double valorHora;

    public HrExtras(double horaDiurna, double horaNocturna, double horaFestivas, double valorHora) {
        this.horaDiurna = horaDiurna;
        this.horaNocturna = horaNocturna;
        this.horaFestivas = horaFestivas;
        this.valorHora = valorHora;
    }

    public double getHoraDiurna() {
        return horaDiurna;
    }

    public void setHoraDiurna(double horaDiurna) {
        this.horaDiurna = horaDiurna;
    }

    public double getHoraNocturna() {
        return horaNocturna;
    }

    public void setHoraNocturna(double horaNocturna) {
        this.horaNocturna = horaNocturna;
    }

    public double getHoraFestivas() {
        return horaFestivas;
    }

    public void setHoraFestivas(double horaFestivas) {
        this.horaFestivas = horaFestivas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcular() {
        double pagoDiurna = horaDiurna * valorHora * 1.25;
        double pagoNocturno = horaNocturna * valorHora * 1.75;
        double pagofestivo = horaFestivas * valorHora * 2;

        return pagoDiurna + pagoNocturno + pagofestivo;
    }
    
}
