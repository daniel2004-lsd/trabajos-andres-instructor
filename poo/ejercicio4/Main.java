package ejercicio4;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(100000, "Daniel");

        System.out.println( "Acabas de depositar $" + cuentaBancaria.depositar(50000));
        System.out.println(".................................................................");
        
        System.out.println( "Acabas de retirar $" + cuentaBancaria.retirar(40000));
        System.out.println(".................................................................");

        System.out.println( "Acabas de retirar $" + cuentaBancaria.retirar(70000));
        System.out.println(".................................................................");

        System.out.println( "Acabas de depositar $" + cuentaBancaria.depositar(100000));
        System.out.println(".................................................................");

        System.out.println(cuentaBancaria.mostrarSaldo());
        System.out.println(".................................................................");

        System.out.println( "Acabas de retirar $" + cuentaBancaria.retirar(200000));
        System.out.println(".................................................................");


        System.out.println(cuentaBancaria.mostrarSaldo());

    }
}
