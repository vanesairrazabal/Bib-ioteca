
public class App extends Bibilioteca  {
    public static void main(String[] args) {
        mostrarMenu();
        while(opcionUsuario != -1){
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