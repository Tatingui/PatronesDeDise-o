import java.util.List;

public class TorreArtilleria extends TorreDefensa {

    private final int DANO_BASE = 5;

    public TorreArtilleria(int x, int y) {
        super("Artilleria", 15, x, y);
    }

    @Override
    protected List<Enemigo> seleccionarObjetivos(List<Enemigo> enemigosEnRango) {
        System.out.println("[Enemigos] Seleccionando a TODOS los enemigos en rango.");
        return enemigosEnRango;
    }

    @Override
    protected void aplicarAtaqueAObjetivos(List<Enemigo> objetivos) {
        System.out.println("[Ataque] Ejecutando ataque de area (" + DANO_BASE + " daño por unidad)...");
        for (Enemigo e : objetivos) {
            e.recibirDano(DANO_BASE);
        }
    }
}
