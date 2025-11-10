/**
 * Programa: DivisionSegura.java
 * Descripcion : 
 * Este programa solicita al usuario ingresar dos números enteros y realiza la división.
 * Controla el error de división entre cero mediante manejo de excepciones.
 * Si el divisor es cero, muestra el mensaje: "Error: división entre cero no permitida".
 * Permite repetir la operación si el usuario lo desea.
 */

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            try {
                // Solicitar los números al usuario
                System.out.print("Ingrese el primer número: ");
                int num1 = sc.nextInt();

                System.out.print("Ingrese el segundo número: ");
                int num2 = sc.nextInt();

                // Validar que no se divida entre cero
                if (num2 == 0) {
                    throw new ArithmeticException("división entre cero no permitida");
                }

                // Realizar la división con decimales
                double resultado = (double) num1 / num2;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: entrada inválida, ingrese solo números enteros.");
                sc.nextLine(); // limpiar la entrada incorrecta
            }

            // Consumir salto de línea pendiente antes de preguntar
            sc.nextLine(); 

            // Preguntar si el usuario desea realizar otra división
            System.out.print("¿Desea hacer otra división? (s/n): ");
            continuar = sc.nextLine().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
        sc.close();
    }
}