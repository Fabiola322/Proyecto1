public class CuentaBancaria {
    private String titular;
    private double saldo;

    //CONSTRUCTOR
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    //Método para depositar dinero
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Depósito realizado correctamente");
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto){
        if(monto > saldo){
            System.out.println("No se puede retirar más del saldo disponible.");
        } else if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        }else {
            saldo -= monto;
            System.out.println("Retirado realizado correctamente");
        }
    }
    //Método para mostrar saldo
    public void mostrarSaldo(){
        System.out.println("Saldo actual: S/ " + saldo);
    }
    //Getter para titular
    public String getTitular() {
        return titular;
    }
    //Getter para el saldo
    public double getSaldo() {
        return saldo;
    }
}
