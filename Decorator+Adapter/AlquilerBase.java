// AlquilerBase.java - Componente concreto
public class AlquilerBase implements Alquiler {
    private String descripcion;
    private float costoBase;

    public AlquilerBase(String descripcion, float costoBase) {
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }

    @Override
    public String obtenerDescripcion() {
        return descripcion;
    }

    @Override
    public float calcularCosto() {
        return costoBase;
    }
}