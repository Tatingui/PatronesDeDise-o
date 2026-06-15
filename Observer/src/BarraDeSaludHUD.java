public class BarraDeSaludHUD implements Observador {
    private static BarraDeSaludHUD instancia;

    private BarraDeSaludHUD() {}

    public static BarraDeSaludHUD getInstancia() {
        if (instancia == null) {
            instancia = new BarraDeSaludHUD();
        }
        return instancia;
    }

    @Override
    public void actualizar(Personaje personaje) {
        int salud = personaje.obtenerSaludActual();
        int maxSalud = personaje.obtenerSaludMaxima();
        double porcentaje = (double) salud / maxSalud;

        System.out.printf("[HUD Barra] Salud visual actualizada: %d / %d (%.0f%%)\n", salud, maxSalud, porcentaje * 100);

        if (porcentaje < 0.25) {
            System.out.println("[HUD Barra] ¡PELIGRO! Barra roja y parpadeando");
        }
    }
}