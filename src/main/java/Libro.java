

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro extends Bibilioteca {
    String nombreLibro;
    String nombreAutor;
     static  boolean prestado = false;
    Scanner scanner = new Scanner(System.in);

    public static void estadoLibro() {
        if (prestado) {
            System.out.println("El libro esta prestado.");
        } else {
            prestado = false;
            System.out.println("El libro esta disponible.");
        }
    }



}