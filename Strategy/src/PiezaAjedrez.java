public abstract class PiezaAjedrez {

    protected String nombre;
    protected Coordenada posicionActual;
    protected Movimiento logicaMovimiento;

    public PiezaAjedrez(String nombre, Coordenada posicionInicial) {
        this.nombre = nombre;
        this.posicionActual = posicionInicial;
    }

    //Mutacion del estado
    public void setLogicaMovimiento(Movimiento nuevoEstado) {
        this.logicaMovimiento = nuevoEstado;
    }

    //DELEGA el comportamiento a la estrategia
    public boolean mover(Coordenada destino) {
        //Usa la Estrategia
        boolean valido = logicaMovimiento.esMovimientoValido(posicionActual, destino);

        if (valido) {
            this.posicionActual = destino;
            return true;
        }
        else{
            return false;
        }
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public Coordenada obtenerPosicion() {
        return this.posicionActual;
    }
}