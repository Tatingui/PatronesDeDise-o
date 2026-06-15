public class UnidadSoldado implements ComponenteMilitar {
    private final String nombre;
    private final String rango;

    public UnidadSoldado(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
    }

    @Override
    public void ejecutarOrden(String orden) {
        System.out.println("[SOLDADO] " + nombre + " (" + rango + ") ha recibido y ejecutado la orden: " + orden);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}