// Juego.java - Cliente
public class Juego {
    public static void main(String[] args) {

        // ==================================
        // CON DIRECTOR - paquetes predefinidos
        // ==================================
        System.out.println(">>> CON DIRECTOR <<<");

        PaqueteTuristicoBuilder builder = new PaqueteTuristicoBuilder();
        VendedorPaquetes vendedor = new VendedorPaquetes(builder);

        System.out.println("\n-- Paquete Basico --");
        vendedor.construirPaqueteBasico();
        PaqueteTuristico basico = builder.build();
        basico.mostrarDetalle();

        // Importante: hay que crear un builder nuevo para cada paquete
        // para que los valores no se mezclen entre construcciones
        builder = new PaqueteTuristicoBuilder();
        vendedor = new VendedorPaquetes(builder);

        System.out.println("\n-- Paquete Estandar --");
        vendedor.construirPaqueteEstandar();
        PaqueteTuristico estandar = builder.build();
        estandar.mostrarDetalle();

        builder = new PaqueteTuristicoBuilder();
        vendedor = new VendedorPaquetes(builder);

        System.out.println("\n-- Paquete Premium --");
        vendedor.construirPaquetePremium();
        PaqueteTuristico premium = builder.build();
        premium.mostrarDetalle();

        // ==================================
        // SIN DIRECTOR - paquete personalizado
        // ==================================
        System.out.println("\n>>> SIN DIRECTOR - Paquete personalizado <<<");

        PaqueteTuristico personalizado = new PaqueteTuristicoBuilder()
                .setFechas("2025-06-01", "2025-06-04")
                .setTipoHabitacion("Doble")
                .setRegimenComidas("Desayuno")
                .setSpa(true)
                .setTraslados(false)
                .build();

        personalizado.mostrarDetalle();
    }
}