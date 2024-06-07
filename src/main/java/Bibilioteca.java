

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibilioteca {

   static Persona miPersona = new Persona();
    static Scanner scanner = new Scanner(System.in);

    static List<Libro> listaDeLibros = new ArrayList<>();

    public static void mostrarMenu() {
        System.out.println("1- Agregar Libro");
        System.out.println("2- Buscar libro ");
        System.out.println("3- Mostrar Lista de libros");
        System.out.println("4- Registrarse");
        System.out.println("5- Consular Estado de Libro");
        System.out.println("6- Buscar Usuario");
        System.out.println("7- Devolver libro");
        System.out.println("0- Salir");
        System.out.println("----------------");
    }


    public static void crearUsuario() {
        Usuario miUsuario = new Usuario();
        Usuario.listaDeUsuarios.add(miPersona.cedulaPersona);
    }

    public static void agregarLibro() {
        Libro miLibro = new Libro();
        System.out.println("¿Cual es el nombre del Libro?");
        miLibro.nombreLibro = scanner.next();
        System.out.println("Cual es el autor de este libro?");
        miLibro.nombreAutor = scanner.next();
        listaDeLibros.add(miLibro);
    }

    public static void prestarLibro() {

    }

    public static void devolverLibro() {
    }

    public static void buscarLibro() {
        boolean encontrado = false;
        System.out.println("ingrese el libro a buscar");
        String nombreLibro = scanner.next();
        for (Libro a : listaDeLibros) {
            if (a.nombreLibro.equals(nombreLibro)) {
                encontrado = true;
                System.out.println("Libro encontrado: " + a);
            }
        }
        if(!encontrado){
            System.out.println("Libro no encontrado");
        }
    }

    public static void buscarUsuario() {
        boolean encontrado = false;
        System.out.println("ingrese el usuario a buscar");
        String usuario = scanner.next();
        for(Persona u : ){

        }
            }
            if( encontrado){
        System.out.println("Libro no encontrado");
    }
        }


    }

    public static void mostrarListaDeLibros() {
        System.out.println("Lista de Libros");
        for (Libro l : listaDeLibros) {
            System.out.println(l);
        }

    }

}