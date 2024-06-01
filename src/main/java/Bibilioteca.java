

import java.util.ArrayList;
import java.util.List;

public class Bibilioteca {
    static Libro miLibro = new Libro();
    static Persona miPersona = new Persona();
    Usuario miUsuario = new Usuario();


    List<String> listaDeLibros = new ArrayList<>();


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

}