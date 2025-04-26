package ejercicio4;

public class CuentaBancaria {
    private float saldo;
    private String titular;

    public CuentaBancaria(float saldo , String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public float depositar(float monto){
        saldo += monto;
        return monto;
    }
    public float retirar(float monto){
        if (monto <= saldo) {
            saldo -= monto; // es como decir saldo = saldo - monto
            System.out.println("retiro exitoso! . te quedan  $"  +  saldo);
        }
        else{
            System.out.println("No tienes suficiente dinero para retirar " + monto);
            return 0;
        }
        return monto;
    }
    public String mostrarSaldo(){
        return "el saldo de tu cuenta es: $ " + saldo;
    }
}
