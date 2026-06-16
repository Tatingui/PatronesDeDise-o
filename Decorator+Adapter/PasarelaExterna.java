// PasarelaExterna.java - Sistema incompatible (el Adaptado)
public class PasarelaExterna {
    public String ejecutarTransaccion(float monto) {
        System.out.println("[EXTERNA] Ejecutando transaccion de $" + monto);
        return "TXN_OK";
    }

    public boolean verificarEstado() {
        return true;
    }
}