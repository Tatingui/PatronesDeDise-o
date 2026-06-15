//Indireccion para simplificar el codigo del cliente
public class GestorTablero {

    private final TableroDeJuego tablero; //Receptor
    private final GestorDeHistorial gestor; //Invocador

    public GestorTablero(TableroDeJuego tablero, GestorDeHistorial gestor) {
        this.tablero = tablero;
        this.gestor = gestor;
    }

    public void establecerCelda(TipoCelda tipo, int x, int y) {
        Comando nuevoComando = new ComandoEstablecerCelda(tablero, tipo, x, y);
        gestor.ejecutarYGuardar(nuevoComando);
    }

    public void deshacer() {
        gestor.deshacerUltimo();
    }
}


