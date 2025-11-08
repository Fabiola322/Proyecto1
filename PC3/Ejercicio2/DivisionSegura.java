package pc3.ejercicio2;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continuar;  // Variable para controlar si el usuario quiere seguir

        do {
            try {
                System.out.print("Ingrese el primer número: ");
                int num1 = sc.nextInt();

                System.out.print("Ingrese el segundo número: ");
                int num2 = sc.nextInt();

                int resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error: división entre cero no permitida");
            } catch (Exception e) {
                System.out.println("Error: entrada inválida, ingrese solo números enteros");
                sc.nextLine(); // limpiar la entrada incorrecta
            }

            System.out.print("¿Desea hacer otra división? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
        sc.close();
    }
}