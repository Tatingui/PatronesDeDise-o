// DecoradorServicio.java - Decorador abstracto
public abstract class DecoradorServicio implements Alquiler {
    protected final Alquiler alquilerDecorado;

    public DecoradorServicio(Alquiler alquiler) {
        this.alquilerDecorado = alquiler;
    }

    @Override
    public String obtenerDescripcion() {
        return alquilerDecorado.obtenerDescripcion();
    }

    @Override
    public float calcularCosto() {
        return alquilerDecorado.calcularCosto();
    }
}