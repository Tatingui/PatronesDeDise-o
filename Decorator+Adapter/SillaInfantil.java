// SillaInfantil.java - Decorador concreto
public class SillaInfantil extends DecoradorServicio {
    private static final float COSTO = 30.0f;

    public SillaInfantil(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String obtenerDescripcion() {
        return alquilerDecorado.obtenerDescripcion() + " + Silla infantil";
    }

    @Override
    public float calcularCosto() {
        return alquilerDecorado.calcularCosto() + COSTO;
    }
}