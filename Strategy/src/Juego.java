public class Juego {

    public static void main(String[] args) {

        PiezaAjedrez miPeon = new Peon(new Coordenada(1, 7));
        System.out.println("\nPeon inicial");
        System.out.println("- " + miPeon.obtenerNombre() + ": " + miPeon.obtenerPosicion());

        miPeon.mover(new Coordenada(1, 9));
        System.out.println("\nPeon intenta moverse fuera del rango");
        System.out.println("- " + miPeon.nombre + ": " + miPeon.posicionActual);

        miPeon.mover(new Coordenada(1, 4));
        System.out.println("\nPeon intenta moverse como Reina");
        System.out.println("- " + miPeon.nombre + ": " + miPeon.posicionActual);

        miPeon.mover(new Coordenada(1, 8));
        System.out.println("\nPeon se mueve a un casillero de promocion");
        System.out.println("- " + miPeon.nombre + ": " + miPeon.posicionActual);

        miPeon.mover(new Coordenada(4, 5));
        System.out.println("\nPeon se mueve como Reina");
        System.out.println("- " + miPeon.nombre + ": " + miPeon.posicionActual);

        miPeon.mover(new Coordenada(4, 1));
        System.out.println("\nPeon se mueve como Reina");
        System.out.println("- " + miPeon.nombre + ": " + miPeon.posicionActual);
    }
}