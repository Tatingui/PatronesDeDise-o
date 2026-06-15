public class Mira extends DecoradorArma {

    public Mira(Arma arma) {
        super(arma);
    }

    @Override
    public String obtenerDescripcion() {
        return armaDecorada.obtenerDescripcion() + " + Mira tactica";
    }

    @Override
    public float obtenerPrecision() {
        return armaDecorada.obtenerPrecision() + 0.15f;
    }
}