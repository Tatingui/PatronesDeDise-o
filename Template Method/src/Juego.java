import java.util.List;

public class Juego {

    public static void main(String[] args) {
        Enemigo orcoLento = new Enemigo("Orco", 50, 5, 5, 5);
        Enemigo goblinRapido = new Enemigo("Goblin", 20, 10, 7, 0);
        Enemigo trollDistante = new Enemigo("Troll", 80, 3, 10, 5);

        List<Enemigo> enemigos = new java.util.ArrayList<>(List.of(orcoLento, goblinRapido, trollDistante));

        TorreDefensa torreRayo = new TorreRayo(0, 0);
        TorreDefensa torreArtilleria = new TorreArtilleria(0, 1);
        TorreDefensa torreHielo = new TorreHielo(0, 2);

        torreRayo.ejecutarCicloAtaque(enemigos);
        torreHielo.ejecutarCicloAtaque(enemigos);
        torreArtilleria.ejecutarCicloAtaque(enemigos);

        System.out.println("\n//ESTADO FINAL//");
        System.out.println("Goblin HP: " + goblinRapido.getSalud() + ", Vel: " + goblinRapido.getVelocidad());
        System.out.println("Orco HP: " + orcoLento.getSalud() + ", Vel: " + orcoLento.getVelocidad());
        System.out.println("Troll HP: " + trollDistante.getSalud() + ", Vel: " + trollDistante.getVelocidad());
    }

}
