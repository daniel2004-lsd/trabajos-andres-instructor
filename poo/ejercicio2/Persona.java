package ejercicio2;

public class Persona {
    private String name;
    private int age;
    
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public String saludar(){
        return "hola mi nombre es: " + name  + "  y tengo " + age + "  años";
    }
    
    public String esMayorEdad(){
        if (age >= 18) {
           return "soy mayor de edad";
        }
        else{
            return "soy menor de edad";
        }
    }
}
