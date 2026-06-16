// PaqueteTuristicoBuilder.java - Builder Concreto
public class PaqueteTuristicoBuilder implements PaqueteBuilder {

    // Valores por defecto
    private String fechaEntrada = "Sin definir";
    private String fechaSalida = "Sin definir";
    private String tipoHabitacion = "Simple";
    private String regimenComidas = "Desayuno";
    private boolean spaIncluido = false;
    private boolean trasladosIncluidos = false;

    @Override
    public PaqueteBuilder setFechas(String entrada, String salida) {
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        return this; // retorna this para permitir encadenamiento
    }

    @Override
    public PaqueteBuilder setTipoHabitacion(String tipo) {
        this.tipoHabitacion = tipo;
        return this;
    }

    @Override
    public PaqueteBuilder setRegimenComidas(String regimen) {
        this.regimenComidas = regimen;
        return this;
    }

    @Override
    public PaqueteBuilder setSpa(boolean incluido) {
        this.spaIncluido = incluido;
        return this;
    }

    @Override
    public PaqueteBuilder setTraslados(boolean incluido) {
        this.trasladosIncluidos = incluido;
        return this;
    }

    @Override
    public PaqueteTuristico build() {
        return new PaqueteTuristico(
                fechaEntrada,
                fechaSalida,
                tipoHabitacion,
                regimenComidas,
                spaIncluido,
                trasladosIncluidos);
    }
}