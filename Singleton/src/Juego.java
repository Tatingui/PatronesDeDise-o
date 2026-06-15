import java.util.Scanner;

public class Juego {

    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);

        GestorDeSonido gestorSonido = GestorDeSonido.obtenerInstancia();

        gestorSonido.cargarSonido("disparo", "sonidos/gunshot.wav");
        gestorSonido.cargarSonido("laser", "sonidos/lasergun.wav");

        GestorDeSonido gestorDelPersonaje = GestorDeSonido.obtenerInstancia();
        gestorDelPersonaje.reproducirSonido("disparo");

        System.out.println("Esperando tecla...");

        entrada.nextLine();

        GestorDeSonido gestorDelEnemigo = GestorDeSonido.obtenerInstancia();
        gestorDelEnemigo.reproducirSonido("laser");

        System.out.println("Esperando tecla...");

        entrada.nextLine();

        System.out.println("¿Son iguales las instancias? " + (gestorSonido == gestorDelPersonaje && gestorDelPersonaje == gestorDelEnemigo));

    }
}