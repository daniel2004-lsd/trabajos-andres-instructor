package ejerciciosAndres.ejercicio4;
public class CategoriaA extends Licencias{
    public CategoriaA(){
        super('A',300000);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Tipo de categoria: " + getCategoria());
        System.out.println("Costo: " + getCosto());
        System.out.println("duracion de la licencia es 10 años");

    }
}