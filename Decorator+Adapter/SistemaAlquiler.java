// SistemaAlquiler.java - Cliente
public class SistemaAlquiler {
    public static void main(String[] args) {

        // ==============================
        // DECORATOR - armar el alquiler
        // ==============================
        System.out.println("=== CONFIGURANDO ALQUILER ===");

        Alquiler alquiler = new AlquilerBase("Auto Sedan", 500.0f);
        System.out.println(alquiler.obtenerDescripcion()
                + " | Costo: $" + alquiler.calcularCosto());

        // Cliente agrega seguro
        alquiler = new SeguroCobertura(alquiler);
        System.out.println(alquiler.obtenerDescripcion()
                + " | Costo: $" + alquiler.calcularCosto());

        // Cliente agrega silla infantil
        alquiler = new SillaInfantil(alquiler);
        System.out.println(alquiler.obtenerDescripcion()
                + " | Costo: $" + alquiler.calcularCosto());

        // Cliente agrega asistencia en ruta
        alquiler = new AsistenciaEnRuta(alquiler);
        System.out.println(alquiler.obtenerDescripcion()
                + " | Costo: $" + alquiler.calcularCosto());

        float costoFinal = alquiler.calcularCosto();

        // ==============================
        // ADAPTER - procesar el pago
        // ==============================
        System.out.println("\n=== PROCESANDO PAGO ===");

        // Pagos nativos - no necesitan Adapter
        PasarelaPago pago = new PagoTarjeta();
        pago.procesarPago(costoFinal);

        pago = new PagoTransferencia();
        pago.procesarPago(costoFinal);

        pago = new PagoBilleteraVirtual();
        pago.procesarPago(costoFinal);

        // Pasarela externa incompatible - necesita Adapter
        PasarelaExterna externa = new PasarelaExterna();
        pago = new PasarelaExternaAdapter(externa);
        pago.procesarPago(costoFinal);
    }
}