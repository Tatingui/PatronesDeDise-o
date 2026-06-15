public class Silenciador extends DecoradorArma {

    public Silenciador(Arma arma) {
        super(arma);
    }

    @Override
    public String obtenerDescripcion() {
        return armaDecorada.obtenerDescripcion() + " + Silenciador";
    }

    @Override
    public int obtenerDanio() {
        return armaDecorada.obtenerDanio() - 5;
    }

    @Override
    public float obtenerPrecision() {
        return armaDecorada.obtenerPrecision() + 0.10f;
    }
}