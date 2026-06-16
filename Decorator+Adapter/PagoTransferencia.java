// PagoTransferencia.java - Implementacion nativa
public class PagoTransferencia implements PasarelaPago {
    @Override
    public boolean procesarPago(float monto) {
        System.out.println("[TRANSFERENCIA] Procesando pago de $" + monto);
        return true;
    }
}