
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    static String nombrePersona;
    static int cedulaPersona;
    static int celularPersona;
    static String direccion;
    static Scanner scanner = new Scanner(System.in);

    public static void registrarUsuario() {
        System.out.println("¿Cual es su nombre?: ");
        nombrePersona = scanner.next();
        System.out.println("¿Cual es su cedula?: ");
        cedulaPersona = scanner.nextInt();
        System.out.println("¿Cual es su celular?: ");
        celularPersona = scanner.nextInt();
        System.out.println("¿Donde vive?: ");
        direccion = scanner.next();

    }


}