package ejercicio7;

public class Estudiante {
    private String nombre;
    private double nota;

    
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getNota() {
        return nota;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean esAprobado(){
        return nota >= 3.0;
    }

    public void mostrarDatos(){
        System.out.println("el nombre del estudiante es:  "  + nombre);
        System.out.println("la nota de estudiante es:  " + nota);
        if (esAprobado()) {
            System.out.println("estado: Aprobado ");
        }
        else{
            System.out.println("estado: Desapobado ");

        }
    }
}
