

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibilioteca {
    static Libro miLibro = new Libro();
    static Persona miPersona = new Persona();
    Usuario miUsuario = new Usuario();
   static Scanner scanner = new Scanner(System.in);

   static List<String> listaDeLibros = new ArrayList<>();

    public static void mostrarMenu() {
        System.out.println("---BIENVENIDO A LA BIBLIOTECA---");
        System.out.println("1- Agregar Libro");
        System.out.println("2- Buscar libro ");
        System.out.println("3- Mostrar Lista de libros");
        System.out.println("4- Registrarse");
        System.out.println("5- Consular Estado de Libro");
        System.out.println("6- Buscar Usuario");
        System.out.println("7- Devolver libro");
        System.out.println("0- Salir");
    }
   static int opcionUsuario = scanner.nextInt();

    public static void agregarLibro() {
        System.out.println("¿Cual es el nombre del Libro?: ");
        miLibro.nombreLibro = miLibro.scanner.next();
        System.out.println("Cual es el autor de este libro?: ");
        miLibro.nombreAutor = miLibro.scanner.next();

    }

    public static void crearUsuario() {
        Usuario.listaDeUsuarios.add(miPersona.cedulaPersona);
    }

    public static void prestarLibro() {

    }

    public static void devolverLibro() {

    }

    public static void buscarLibro() {

    }

    public static void buscarUsuario() {

    }
    public static void  mostrarListaDeLibros(){
        System.out.println(listaDeLibros);
    }

}