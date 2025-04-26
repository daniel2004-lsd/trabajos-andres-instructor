package ejerciciosAndres.ejercicio4;

public class CategoriaC extends Licencias{
    public CategoriaC(){
        super('C' , 800000);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("el tipo de categoria es: " + getCategoria() + "  vehiculos de servicio publico");
        System.out.println("costo: " + getCosto());
        System.out.println("duracion de la licencia son 10 años despues de los 3 años de uso se suspende el servicio publico");
    }
}
