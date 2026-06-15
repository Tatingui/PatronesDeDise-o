public class CargadorExtendido extends DecoradorArma {

    public CargadorExtendido(Arma arma) {
        super(arma);
    }

    @Override
    public String obtenerDescripcion() {
        return armaDecorada.obtenerDescripcion() + " + Cargador extendido";
    }

    @Override
    public float obtenerPrecision() {
        return armaDecorada.obtenerPrecision() - 0.05f;
    }

    @Override
    public int obtenerCapacidadCargador() {
        return armaDecorada.obtenerCapacidadCargador() + 10;
    }
}