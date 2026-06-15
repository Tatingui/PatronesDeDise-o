public class PistolaSimple implements Arma {

    @Override
    public String obtenerDescripcion() {
        return "Pistola base";
    }

    @Override
    public int obtenerDanio() {
        return 50;
    }

    @Override
    public float obtenerPrecision() {
        return 0.60f;
    }

    @Override
    public int obtenerCapacidadCargador() {
        return 12;
    }
}