package ejerciciosAndres.ejercicio4;
public class CategoriaB extends Licencias {
    public CategoriaB(){
        super('B' , 400000);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Tipo de categoria " + getCategoria() + " vehiculo particular");
        System.out.println("Costo: " + getCosto());
        System.out.println("duracion de la licencia es 10 años");

    }
}
