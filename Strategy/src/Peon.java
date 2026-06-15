public class Peon extends PiezaAjedrez {

    public Peon(Coordenada posicionInicial) {
        super("Peon", posicionInicial);
        this.logicaMovimiento = new MovimientoPeon(); //Logica de movimiento inicial: Peon
    }

    @Override
    public boolean mover(Coordenada destino) {
        boolean seMovio = super.mover(destino);

        if (seMovio) {
            if (posicionActual.y == 8) { // Logica de promocion
                setLogicaMovimiento(new MovimientoReina()); //Nueva logica de movimiento: Reina
            }
        }

        return seMovio;
    }
}
