// PaqueteBuilder.java - Interfaz Builder
public interface PaqueteBuilder {
    PaqueteBuilder setFechas(String entrada, String salida);

    PaqueteBuilder setTipoHabitacion(String tipo);

    PaqueteBuilder setRegimenComidas(String regimen);

    PaqueteBuilder setSpa(boolean incluido);

    PaqueteBuilder setTraslados(boolean incluido);

    PaqueteTuristico build();
}