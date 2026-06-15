import java.util.Comparator;
import java.util.List;

public class TorreHielo extends TorreDefensa {

    private final int REDUCCION_VELOCIDAD = 5;

    public TorreHielo(int x, int y) {
        super("Hielo", 10, x, y);
    }

    @Override
    protected List<Enemigo> seleccionarObjetivos(List<Enemigo> enemigosEnRango) {
        System.out.println("[Enemigos] Priorizando el enemigo mas rapido en rango.");
        return enemigosEnRango.stream()
                .max(Comparator.comparingInt(Enemigo::getVelocidad))
                .map(List::of)
                .orElse(List.of());
    }

    @Override
    protected void aplicarAtaqueAObjetivos(List<Enemigo> objetivos) {
        System.out.println("[Ataque] Ejecutando ralentizacion...");
        for (Enemigo e : objetivos) {
            e.reducirVelocidad(REDUCCION_VELOCIDAD);
        }
    }
}
