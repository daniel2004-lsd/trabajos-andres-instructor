package ejerciciosAndres.ejercicio4;

public class Estudiantes {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private int telefono;
    private String rh;
    private Licencias licencias;

    public Estudiantes(String nombre, String apellido, int edad, String direccion, int telefono, String rh,
        Licencias licencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rh = rh;
        this.licencias = licencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public Licencias getLicencias() {
        return licencias;
    }

    public void setLicencias(Licencias licencias) {
        this.licencias = licencias;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("RH: " + rh);
        System.out.println("LICENCIA:");
        licencias.mostrarInformacion(); // Esto muestra la info de la licencia
    }
    
}
