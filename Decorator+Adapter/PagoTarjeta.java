// PagoTarjeta.java - Implementacion nativa
public class PagoTarjeta implements PasarelaPago {
    @Override
    public boolean procesarPago(float monto) {
        System.out.println("[TARJETA] Procesando pago de $" + monto);
        return true;
    }
}