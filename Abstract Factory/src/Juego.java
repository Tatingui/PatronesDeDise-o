public class Juego {

    public static void main(String[] args) {
        System.out.println("Jugador 1: Raza Humana");
        FabricaDeUnidades fabricaHumana = new FabricaHumana();

        UnidadLigera unidadLigeraHumana = fabricaHumana.crearUnidadLigera();
        UnidadPesada unidadPesadaHumana = fabricaHumana.crearUnidadPesada();

        unidadLigeraHumana.moverse();
        unidadPesadaHumana.defender();

        System.out.println("\nJugador 2: Raza Orco");
        FabricaDeUnidades fabricaOrco = new FabricaOrco();

        UnidadLigera unidadLigeraOrco = fabricaOrco.crearUnidadLigera();
        UnidadPesada unidadPesadaOrco = fabricaOrco.crearUnidadPesada();

        unidadLigeraOrco.moverse();
        unidadPesadaOrco.defender();
    }
}