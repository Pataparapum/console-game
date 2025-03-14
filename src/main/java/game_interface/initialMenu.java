package game_interface;
import java.util.Scanner;
import character.Characteritics;
import character.Clase;

public class initialMenu {

    int puntaje;
    public Characteritics personaje = new Characteritics();

    private final Scanner entrada = new Scanner(System.in);

    public void Inicio() {

        while (true ) {

            System.out.println("Bienvenido a Dungeon Meshi\n ");
            if (puntaje != 0) System.out.println("ultimo puntaje: " + puntaje);

            System.out.println("- (1) Iniciar");
            System.out.println("- (2) Salir \n");

            int eleccion = entrada.nextInt();
            System.out.println("Que quieres hacer");


            if (eleccion == 2) {
                break;
            }
            selectName();
        }

        System.out.println("\nAdios, nos vemos en tu proxima partida");

    }

    private void selectName() {
        String name = "";

        while (name.isEmpty()){
            name = entrada.nextLine();
            System.out.println("\nElije el nombre del personaje   ");
        }

        personaje.username = name;

        System.out.println("Seleccione su clase: \n");
        System.out.println("- (1) guerrero");
        System.out.println("- (2) mago");
        System.out.println("- (3) ladron");
        System.out.println("volver (4)");

        int eleccion = entrada.nextInt();

        switch (eleccion) {
            case 1 :
                personaje.clase = new Clase("guerrero");
                break;
            case 2:
                personaje.clase = new Clase("mago");
                break;
            case 3:
                personaje.clase = new Clase("ladron");
                break;
            case 4:
                break;
            default:
                break;
            }

        if (eleccion != 4 ) {

            System.out.println("\n" + personaje.username + " de clase " + personaje.clase.getTipo() );
            System.out.println("Estas seguro de tu elección");
            System.out.println("- (1) si / (2) no");
            int yN = entrada.nextInt();

            if (yN == 2) {
                selectName();
            }

            Game();
        }
    }

    private void Game() {
        boolean derrota = false;
        while (!derrota) {

        }
    }
}

