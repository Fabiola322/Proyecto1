//CASO 03:
package upn_caso03;
import java.util.ArrayList;
import java.util.Scanner;
public class lista_de_alumno {
	 public static void main(String[] args) {
		 
	    // Crear un ArrayList y un objeto Scanner para leer los nombres ingresados y almacenar los nombres de los estudiantes
		 Scanner sc = new Scanner(System.in);
	     ArrayList<String> estudiantes = new ArrayList<>();
	        
	     System.out.println("=== LISTA DE ESTUDIANTES ===");
	        
	    // Solicitar al usuario la cantidad de estudiantes a ingresar en la lista   
	     System.out.println("Cuantos estudiantes desea ingresar a la lista? ");
	     int cantidad = sc.nextInt();
	     sc.nextLine();
	     
	     for (int i=0; i < cantidad; i++) {
	    	System.out.print("Nombre del estudiante " + (i+1) + ": " );
	    	String nombre = sc.nextLine();
	    	estudiantes.add(nombre);
	     }
	     
	     
	     // Mostrar la lista completa
	        System.out.println("Lista completa de estudiantes:");
	        for (String nombre : estudiantes) {
	            System.out.println("- " + nombre);
	        }
	        
	     //Eliminar un estudiante de la lista
	       System.out.println("Desea eliminar un estudiante de la lista?");
	       String respuesta = sc.nextLine();
	       
	       if (respuesta.equalsIgnoreCase("si")) {
	            System.out.print("Ingrese el número del estudiante a eliminar (1 a " + estudiantes.size() + "): ");
	            int posicion = sc.nextInt();
	            
	      // Validar que el número esté dentro del rango
	         if (posicion >= 1 && posicion <= estudiantes.size()) {
	         String eliminado = estudiantes.remove(posicion - 1);
	         System.out.println("\nSe eliminó: " + eliminado);
	         } else {
	           System.out.println("\nNúmero inválido. No se encuentra en el rango de alumnos. ");
	         }
	        } else {
	            System.out.println("\nNo se eliminó ningún estudiante.");
	        }
	        
	        // Mostrar la lista actualizada
	        System.out.println("\nLista actualizada de estudiantes:");
	        for (String nombre : estudiantes) {
	            System.out.println("- " + nombre);
	        }
	        
	        sc.close();
	    
	 }
}
  

