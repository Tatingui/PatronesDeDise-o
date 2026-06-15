//Receptor
public class TableroDeJuego {

    private final Celda[][] tablero;
    private final int tamano = 3;

    public TableroDeJuego() {
        tablero = new Celda[tamano][tamano];
        for (int x = 0; x < tamano; x++) {
            for (int y = 0; y < tamano; y++) {
                tablero[x][y] = new Celda(TipoCelda.VACIA);
            }
        }
    }

    public void establecerTipoCelda(TipoCelda tipo, int x, int y) {
        tablero[x][y].setTipo(tipo);
    }

    public TipoCelda obtenerTipoCelda(int x, int y) {
        return tablero[x][y].getTipo();
    }

    public void dibujar() {

        for (int x = 0; x < tamano; x++) {
            for (int y = 0; y < tamano; y++) {
                char simbolo = tablero[x][y].getTipo().simbolo;
                System.out.print("|" + simbolo + "|");
            }
            System.out.println();
        }
        System.out.println();
    }
}
