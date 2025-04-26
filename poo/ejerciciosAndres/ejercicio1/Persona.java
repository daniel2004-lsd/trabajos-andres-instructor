package ejerciciosAndres.ejercicio1;


public class Persona {  // Clase que representa a una persona con su nombre, valor por día y días trabajados
    private String name; // este es un atrubuto de la clase Persona, que representa el nombre de la persona
    private double valorDia; // este es un atrubuto de la clase Persona, que representa el valor por día de la persona
    private double diasTrabajados;// este es un atrubuto de la clase Persona, que representa los días trabajados por la persona

    public Persona(String name, double valorDia, double diasTrabajados) { // Constructor de la clase Persona que inicializa los atributos name, valorDia y diasTrabajados
        this.name = name; // Inicializa el atributo name con el valor pasado como parámetro
        this.valorDia = valorDia; 
        this.diasTrabajados = diasTrabajados;
    }

    public double getValorDia(){ // este es un método que devuelve el valor por día de la persona
        return valorDia; // Devuelve el valor del atributo valorDia
    }

    public void setValorDia(double valorDia) { // este es un método que establece el valor por día de la persona
        this.valorDia = valorDia; // Establece el valor del atributo valorDia con el valor pasado como parámetro
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double calcularSueldo(){ // este es un método que calcula el sueldo base de la persona
        return  valorDia * diasTrabajados; // Devuelve el resultado de multiplicar el valor por día por los días trabajados
    }


}
