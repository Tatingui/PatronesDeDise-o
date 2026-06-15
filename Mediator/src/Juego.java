public class Juego {

    public static void main(String[] args) {

        MediadorSalaChat sala = new MediadorSalaChat();

        Jugador jugadorA = new Jugador(sala, "Alice", Equipo.ROJO);
        Jugador jugadorB = new Jugador(sala, "Bob", Equipo.AZUL);
        Jugador jugadorC = new Jugador(sala, "Charlie", Equipo.ROJO);
        Jugador jugadorD = new Jugador(sala, "David", Equipo.AZUL);

        System.out.println("\n*MENSAJE GLOBAL*");
        jugadorA.chatearGlobal("Hola a todos");

        System.out.println("\n*MENSAJE DE EQUIPO*");
        jugadorA.chatearEquipo("Me escondo en torre, ¡cubrirme!");

        System.out.println("\n*MENSAJE PRIVADO*");
        jugadorB.chatearPrivado("Charlie", "¿Cómo estás camarada Charlie?");
    }
}
