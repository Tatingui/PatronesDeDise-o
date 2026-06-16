// PaqueteTuristico.java - Producto
public class PaqueteTuristico {
    private String fechaEntrada;
    private String fechaSalida;
    private String tipoHabitacion;
    private String regimenComidas;
    private boolean spaIncluido;
    private boolean trasladosIncluidos;

    public PaqueteTuristico(String fechaEntrada, String fechaSalida,
                             String tipoHabitacion, String regimenComidas,
                             boolean spaIncluido, boolean trasladosIncluidos) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoHabitacion = tipoHabitacion;
        this.regimenComidas = regimenComidas;
        this.spaIncluido = spaIncluido;
        this.trasladosIncluidos = trasladosIncluidos;
    }

    public void mostrarDetalle() {
        System.out.println("=== PAQUETE TURISTICO ===");
        System.out.println("Fechas: " + fechaEntrada + " al " + fechaSalida);
        System.out.println("Habitacion: " + tipoHabitacion);
        System.out.println("Regimen: " + regimenComidas);
        System.out.println("Spa: " + (spaIncluido ? "Si" : "No"));
        System.out.println("Traslados: " + (trasladosIncluidos ? "Si" : "No"));
    }
}