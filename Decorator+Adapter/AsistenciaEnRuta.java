// AsistenciaEnRuta.java - Decorador concreto
public class AsistenciaEnRuta extends DecoradorServicio {
    private static final float COSTO = 80.0f;

    public AsistenciaEnRuta(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String obtenerDescripcion() {
        return alquilerDecorado.obtenerDescripcion() + " + Asistencia en ruta";
    }

    @Override
    public float calcularCosto() {
        return alquilerDecorado.calcularCosto() + COSTO;
    }
}