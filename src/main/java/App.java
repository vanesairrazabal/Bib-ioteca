
public class App extends Bibilioteca  {
    public static void main(String[] args) {
        System.out.println("---BIENVENIDO A LA BIBLIOTECA---");
        System.out.println();
        System.out.println();
        int opcionUsuario = -2;
        while(opcionUsuario !=-1){
            mostrarMenu();
            opcionUsuario = scanner.nextInt();
            switch (opcionUsuario){
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    buscarLibro();
                    break;
                case 3:
                    mostrarListaDeLibros();
                    break;
                case 4:
                    Persona.registrarUsuario();
                    crearUsuario();
                    break;
                case 5:
                    Libro.estadoLibro();
                    break;
                case 6:
                    buscarUsuario();
                    break;
                case 7:
                    devolverLibro();
                    break;
            }
        }
    }
}