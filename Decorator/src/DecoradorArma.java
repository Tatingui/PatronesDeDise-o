public abstract class DecoradorArma implements Arma {

    protected final Arma armaDecorada;

    public DecoradorArma(Arma arma) {
        if (arma == null) {
            throw new IllegalArgumentException("El arma decorada no puede ser null");
        }

        this.armaDecorada = arma;
    }

    @Override
    public String obtenerDescripcion() {
        return armaDecorada.obtenerDescripcion();
    }

    @Override
    public int obtenerDanio() {
        return armaDecorada.obtenerDanio();
    }

    @Override
    public float obtenerPrecision() {
        return armaDecorada.obtenerPrecision();
    }

    @Override
    public int obtenerCapacidadCargador() {
        return armaDecorada.obtenerCapacidadCargador();
    }
}