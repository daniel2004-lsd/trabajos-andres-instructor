public class Usuario {
    private String nombre;
    private int edad;
    private Plan plan;

    public Usuario(String nombre, int edad, Plan plan) {
        this.nombre = nombre;
        this.edad = edad;
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public void mostrarInformacionUsuario(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        plan.mostrarInformacion();
    }
    
}
