// SeguroCobertura.java - Decorador concreto
public class SeguroCobertura extends DecoradorServicio {
    private static final float COSTO = 150.0f;

    public SeguroCobertura(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String obtenerDescripcion() {
        return alquilerDecorado.obtenerDescripcion() + " + Seguro cobertura total";
    }

    @Override
    public float calcularCosto() {
        return alquilerDecorado.calcularCosto() + COSTO;
    }
}