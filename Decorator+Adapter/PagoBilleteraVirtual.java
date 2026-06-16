// PagoBilleteraVirtual.java - Implementacion nativa
public class PagoBilleteraVirtual implements PasarelaPago {
    @Override
    public boolean procesarPago(float monto) {
        System.out.println("[BILLETERA] Procesando pago de $" + monto);
        return true;
    }
}