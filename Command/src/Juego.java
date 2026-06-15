public class Juego {

    public static void main(String[] args) {

        TableroDeJuego tablero = new TableroDeJuego();
        GestorDeHistorial gestor = new GestorDeHistorial();
        GestorTablero gestorTablero = new GestorTablero(tablero, gestor);

        System.out.println("\n- Tablero inicial: ");
        tablero.dibujar();

        gestorTablero.establecerCelda(TipoCelda.TIERRA, 1, 0);
        gestorTablero.establecerCelda(TipoCelda.AGUA, 1, 1);
        gestorTablero.establecerCelda(TipoCelda.ROCA, 1, 2);
        gestorTablero.establecerCelda(TipoCelda.TIERRA, 1, 2);

        System.out.println("\n- Tablero modificado:");
        tablero.dibujar();

        gestorTablero.deshacer();
        System.out.println("\n- Tablero UNDO 1:");
        tablero.dibujar();

        gestorTablero.deshacer();
        System.out.println("\n- Tablero UNDO 2:");
        tablero.dibujar();

        gestorTablero.deshacer();
        System.out.println("\n- Tablero UNDO 3:");
        tablero.dibujar();

        gestorTablero.deshacer();
        System.out.println("\n- Tablero UNDO 4:");
        tablero.dibujar();
    }
}
