package ejerciciosAndres.ejercicio4;

public abstract class Licencias {
    private char categoria;
    private double costo;
    
    public char getCategoria() {
        return categoria;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public Licencias(char categoria, double costo) {
        this.categoria = categoria;
        this.costo = costo;
    }
    public abstract void mostrarInformacion();

    
}
