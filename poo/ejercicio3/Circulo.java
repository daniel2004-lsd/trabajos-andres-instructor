package ejercicio3;

public class Circulo {
    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }
    public Float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        this.radio = radio;
    }

    public float calcularArea(){
        return (float)(Math.PI * radio * radio);
    }

}
