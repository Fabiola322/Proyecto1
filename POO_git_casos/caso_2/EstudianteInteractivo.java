// CASO 2: Clase Estudiante con atributos privados
// Consigna: Implementa una clase Java llamada `Estudiante` con atributos privados,
// constructor y métodos `get/set`. El estudiante debe ser creado desde el método `main()` y
// sus datos deben ser mostrados con uso de Scanner. Publica tu código en `caso2/`.
package POO_git_casos.caso_2;
import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteInteractivo {
    // Creación de clase Estudiante
    public static class Estudiante{
        // Atributos privados
        private String nombre;
        private String carrera;
        private int edad;
        private ArrayList<String> cursos;  // lista de cursos (dinámica)

        // Constructor
        public Estudiante(String nombre, String carrera, int edad){
            this.nombre = nombre;
            this.carrera = carrera;
            this.edad = edad;
            this.cursos = new ArrayList<>(); // Inicializamos la lista vacía.
        }

        // Getters
        public String retornarNombre(){
            return nombre;
        }

        public String retornarCarrera(){
            return carrera;
        }

        public int retornarEdad(){
            return edad;
        }

        public String retornarCursos(){
            String cursos_str = "";
            for (String curso : cursos){
                cursos_str += curso + " ";
            }
            return cursos_str.trim();
        }

        // Setters
        public void cambiarNombre(String nombre){
            this.nombre = nombre;
        }

        public void cambiarCarrera(String carrera){
            this.carrera = carrera;
        }

        public void cambiarEdad(int edad){
            this.edad = edad;
        }

        // Otros métodos
        public void agregarCurso(String curso){
            cursos.add(curso);
        }

        public void eliminarCurso(String curso){
            cursos.remove(curso);
        }

        public void mostrarDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Carrera: " + carrera);
            System.out.println("Edad: " + String.valueOf(edad));
            System.out.println("Lista de cursos: " + retornarCursos());
        }


    }

    public static void main(String[] args){
        // Creación del objeto Scanner
        Scanner input = new Scanner(System.in);

        // Recopilación de datos
        System.out.print("Igresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu carrera: ");
        String carrera = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(input.nextLine());

        // Registro de cursos
        System.out.print("Ingresa la cantidad de cursos a inscribir: ");
        int cant_cursos = Integer.parseInt(input.nextLine());

        ArrayList<String> lista_cursos = new ArrayList<>();

        for (int i=1 ; i<=cant_cursos; i++){
            String formatted_message = "Ingrese curso %d : ".formatted(i);
            System.out.print(formatted_message);
            String curso = input.nextLine();
            lista_cursos.add(curso);
        }

        // Creación de instancia
        Estudiante estudiante = new Estudiante(nombre, carrera, edad);
        
        // Agregamos los cursos a la instancia
        for (String curso : lista_cursos){
            estudiante.agregarCurso(curso);
        }

        input.close();

        // Mostramos mensaje de registro exitoso y datos:
        System.out.println("\nRegistro exitoso!\n");
        System.out.println("Datos: \n");
        estudiante.mostrarDatos();

    }
}