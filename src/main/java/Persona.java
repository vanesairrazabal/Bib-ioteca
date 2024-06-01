
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona  {
    String nombrePersona;
    int cedulaPersona;
    int celularPersona;
    String direccion;
    Scanner scanner = new Scanner(System.in);

    public void registrarUsuario() {
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