public class MovimientoReina implements Movimiento {

    @Override
    public boolean esMovimientoValido(Coordenada origen, Coordenada destino){

        if (!ReglasTablero.estaEnRango(destino)) {
            return false;
        }

        int deltaX = Math.abs(origen.x - destino.x);
        int deltaY = Math.abs(origen.y - destino.y);

        if (origen.x == destino.x || origen.y == destino.y) { //Movimiento horizontal o vertical
            return true;
        }
        else if (deltaX == deltaY) { //Movimiento diagonal
            return true;
        }

        return false;
    }
}
