import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TorreRayo extends TorreDefensa {

    private final int DANO_BASE = 15;

    public TorreRayo(int x, int y) {
        super("Rayo", 15, x, y);
    }

    @Override
    protected List<Enemigo> seleccionarObjetivos(List<Enemigo> enemigosEnRango) {
        System.out.println("[Enemigos] Priorizando los 2 enemigos mas cercanos.");
        return enemigosEnRango.stream()
                .sorted(Comparator.comparingDouble(e -> UtilidadDistancia.calcularDistancia(x, y, e)))
                .limit(2)
                .collect(Collectors.toList());
    }

    @Override
    protected void aplicarAtaqueAObjetivos(List<Enemigo> objetivos) {
        System.out.println("[Ataque] Ejecutando rayo enfocado (" + DANO_BASE + " daño por unidad)...");
        for (Enemigo e : objetivos) {
            e.recibirDano(DANO_BASE);
        }
    }
}
