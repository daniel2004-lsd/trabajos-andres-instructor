package ejercicio5;

public class Producto {
    private String name;
    private double price;
    private int amount;

    public Producto(String name , double price , int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
    return "Producto: " + name + ", Precio: $" + price + ", Cantidad: " + amount;
    }
}

