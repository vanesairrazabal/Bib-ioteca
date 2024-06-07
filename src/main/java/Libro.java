

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro /*extends Bibilioteca*/ {
    String nombreLibro;

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    String nombreAutor;
    static boolean prestado = false;
    static Scanner scanner = new Scanner(System.in);

    public static void estadoLibro() {
        if (prestado) {
            System.out.println("El libro esta prestado.");
        } else {
            prestado = false;
            System.out.println("El libro esta disponible.");
        }
    }

    @Override
    public String toString() {
        return "Nombre:'" + nombreLibro + '\'' + ", Autor='" + nombreAutor + '\'';
    }
}