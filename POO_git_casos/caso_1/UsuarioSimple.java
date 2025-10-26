// CASO 1: Lectura de datos simples con Scanner
// Programa que calcula el Índice de Masa Corporal (IMC) a partir del peso y la estatura del usuario.

package POO_git_casos.caso_1;

import java.util.Scanner;

public class UsuarioSimple {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE IMC ===");

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su peso en kilogramos (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su estatura en metros (m): ");
        double estatura = sc.nextDouble();

        // Calcular el IMC
        double imc = peso / (estatura * estatura);

        // Mostrar resultados
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Nombre: " + nombre);
        System.out.printf("IMC: %.2f\n", imc);

        // Clasificación según el valor del IMC
        if (imc < 18.5) {
            System.out.println("Estado: Bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Estado: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Estado: Sobrepeso");
        } else {
            System.out.println("Estado: Obesidad");
        }

        sc.close();
    }
}