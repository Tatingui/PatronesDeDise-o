// VendedorPaquetes.java - Director
public class VendedorPaquetes {

    private PaqueteBuilder builder;

    public VendedorPaquetes(PaqueteBuilder builder) {
        this.builder = builder;
    }

    // El Director encapsula las recetas predefinidas
    public void construirPaqueteBasico() {
        builder.setFechas("2025-01-10", "2025-01-13")
                .setTipoHabitacion("Simple")
                .setRegimenComidas("Desayuno")
                .setSpa(false)
                .setTraslados(false);
    }

    public void construirPaqueteEstandar() {
        builder.setFechas("2025-01-10", "2025-01-17")
                .setTipoHabitacion("Doble")
                .setRegimenComidas("All-inclusive")
                .setSpa(false)
                .setTraslados(true);
    }

    public void construirPaquetePremium() {
        builder.setFechas("2025-01-10", "2025-01-20")
                .setTipoHabitacion("Suite")
                .setRegimenComidas("All-inclusive")
                .setSpa(true)
                .setTraslados(true);
    }
}