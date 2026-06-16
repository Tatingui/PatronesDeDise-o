// PasarelaExternaAdapter.java - El Adapter
public class PasarelaExternaAdapter implements PasarelaPago {
    private final PasarelaExterna pasarelaExterna;

    public PasarelaExternaAdapter(PasarelaExterna pasarela) {
        this.pasarelaExterna = pasarela;
    }

    @Override
    public boolean procesarPago(float monto) {
        // Traduce el idioma nuevo al idioma viejo
        if (!pasarelaExterna.verificarEstado()) {
            System.out.println("[ADAPTER] Pasarela externa no disponible.");
            return false;
        }
        String resultado = pasarelaExterna.ejecutarTransaccion(monto);
        System.out.println("[ADAPTER] Traduciendo respuesta: " + resultado);
        return resultado.equals("TXN_OK");
    }
}