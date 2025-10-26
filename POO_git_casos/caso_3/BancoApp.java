package POO_git_casos.caso_3;
import java.util.InputMismatchException; 
import java.util.Scanner; 
 
public class BancoApp {

    public static class CuentaBancaria { 
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
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Instanciamos el objeto sc de la //clase Scanner para poder usarla 
 
        System.out.println("Ingrese el nombre del Titular: "); 
        String nombre = sc.nextLine(); 
 
        //  Validación del ingreso del saldo inicial 
        double saldoInicial = 0; 
        boolean entradaValida = false; 
 
        // Se repetirá hasta que el usuario ingrese un saldo válido (numérico y //no negativo) 
        do { 
            try { 
                System.out.print("Ingrese el saldo inicial: "); 
                saldoInicial = sc.nextDouble(); 
 
                if (saldoInicial < 0) { 
                    System.out.println("️ El saldo no puede ser negativo."); 
                } else { 
                    entradaValida = true; // Salida del bucle 
                } 
            } catch (InputMismatchException e) { 
                System.out.println(" Error: Debe ingresar un número válido."); 
                sc.nextLine(); // Limpia el buffer del Scanner 
            } 
        } while (!entradaValida); 
 
        //  Instanciamos la clase CuentaBancaria con los datos ingresados 
        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldoInicial); 
 
        int opcion; 
 
        // Menú principal 
        do { 
            System.out.println("\n---  MENÚ BANCO ---"); 
            System.out.println("1. Depositar"); 
            System.out.println("2. Retirar"); 
            System.out.println("3. Ver saldo"); 
            System.out.println("4. Salir"); 
            System.out.print("Elija una opción: "); 
 
            // Validamos que la opción sea numérica 
            while (!sc.hasNextInt()) { 
                System.out.println(" Debe ingresar un número del 1 al 4."); 
                sc.next(); 
                System.out.print("Elija una opción: "); 
            } 
 
            opcion = sc.nextInt(); 
 
            switch (opcion) { 
                case 1: 
                    System.out.print("Ingrese monto a depositar: "); 
                    while (!sc.hasNextDouble()) { 
                        System.out.println(" Ingrese un valor numérico válido."); 
                        sc.next(); 
                        System.out.print("Ingrese monto a depositar: "); 
                    } 
                    double montoDep = sc.nextDouble(); 
                    cuenta.depositar(montoDep); 
                    cuenta.mostrarSaldo(); 
                    break; 
 
                case 2: 
                    System.out.print("Ingrese monto a retirar: "); 
                    while (!sc.hasNextDouble()) { 
                        System.out.println(" Ingrese un valor numérico válido."); 
                        sc.next(); 
                        System.out.print("Ingrese monto a retirar: "); 
                    } 
                    double montoRet = sc.nextDouble(); 
                    cuenta.retirar(montoRet); 
                    cuenta.mostrarSaldo(); 
                    break; 
 
                case 3: 
                    cuenta.mostrarSaldo(); 
                    break; 
 
                case 4: 
                    System.out.println("\n Gracias por usar el sistema, " + cuenta.getTitular() + "."); 
                    break; 
 
                default: 
                    System.out.println(" Opción inválida. Intente nuevamente."); 
            } 
 
        } while (opcion != 4); 
 
        sc.close(); // Cerramos el Scanner 
    } 
} 
 