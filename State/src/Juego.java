public class Juego {

    public static void main(String[] args) {
        Explorador indiana = new Explorador();
        indiana.intentarRecolectar();

        indiana.beberPocion();
        indiana.intentarRecolectar();
        indiana.intentarRecolectar();

        indiana.caerEnTrampa();
        indiana.intentarRecolectar();

        indiana.beberPocion();
        indiana.intentarRecolectar();
    }
}