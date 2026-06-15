public class MovimientoPeon implements Movimiento {

    @Override
    public boolean esMovimientoValido(Coordenada origen, Coordenada destino) {

        if (!ReglasTablero.estaEnRango(destino)) {
            return false;
        }

        if (origen.x == destino.x && destino.y == origen.y + 1) { //Solo avanza una fila en la misma columna
            return true;
        }

        return false;
    }
}
