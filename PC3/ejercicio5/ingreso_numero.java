/* Pregunta 5 – Manejo de múltiples excepciones
Escribe un programa que pida al usuario ingresar un número entero y:
- Si el usuario ingresa un valor no numérico, captura NumberFormatException.
- Si el número es negativo, lanza una excepción personalizada NumeroNegativoException.
- Maneja ambos casos mostrando mensajes claros al usuario.
*/

package pc3.ejercicio5;

import java.util.Scanner;

public class ingreso_numero {

    // Error personalizado
    static class NumeroNegativoException extends Exception{
        // El constructor toma un mensaje que se devolverá.
        public NumeroNegativoException(String mensaje){
            super(mensaje);
        }
    }

    public static class NumeroEnteroPositivo{
        private int valor;

        public NumeroEnteroPositivo(int valor) throws NumeroNegativoException{
            if(valor<0){
                throw new NumeroNegativoException("El valor debe ser positivo");
            }
            this.valor = valor;
        }

        public int getValor(){
            return this.valor;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        NumeroEnteroPositivo num_int = null;

        // Bucle while. Funciona hasta que se ingrese un valor válido.
        while (num_int == null){
            // Sentencias try-catch
            try {
                // Solicitud de dato
                System.out.println("Ingrese un número entero y positivo:");
                String num_str = input.nextLine();                
                num_int = new NumeroEnteroPositivo(Integer.parseInt(num_str));   
            } catch (NumberFormatException e) {
                // Si no tiene formato numérico
                System.out.println("Error: El dato ingresado no tiene formato numérico. \nDetail: %s".formatted(e));
            } catch (NumeroNegativoException e){
                // Captura el error de numero negativo
                System.out.println("Error: %s".formatted(e));
            } catch (Exception e){
                // Otros errores
                System.out.println("Error: %s".formatted(e));
            }
            System.out.println();
        }

        System.out.println("Numero capturado satisfactoriamente");
        System.out.println("Valor: %d".formatted(num_int.getValor()));

        input.close();
    }
}