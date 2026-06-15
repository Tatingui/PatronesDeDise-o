import java.util.List;
import java.util.stream.Collectors;

//Template Method
public abstract class TorreDefensa {

    protected final int rango;
    protected final int x;
    protected final int y;
    protected final String tipo;

    public TorreDefensa(String tipo, int rango, int x, int y) {
        this.tipo = tipo;
        this.rango = rango;
        this.x = x;
        this.y = y;
    }

    //Pasos variables
    protected abstract List<Enemigo> seleccionarObjetivos(List<Enemigo> enemigosEnRango);
    protected abstract void aplicarAtaqueAObjetivos(List<Enemigo> objetivos);

    //Pasos comunes
    private List<Enemigo> verificarEnemigosEnRango(List<Enemigo> enemigosEnMapa) {
        return enemigosEnMapa.stream()
                .filter(e -> e.getSalud() > 0)
                .filter(e -> UtilidadDistancia.calcularDistancia(x, y, e) <= rango)
                .collect(Collectors.toList());
    }

    public final void ejecutarCicloAtaque(List<Enemigo> enemigosEnMapa) {
        System.out.println("\n//TURNO DE LA TORRE: " + tipo + "//");

        //Verificar enemigos en rango
        List<Enemigo> enemigosEnRango = verificarEnemigosEnRango(enemigosEnMapa);
        if (enemigosEnRango.isEmpty()) {
            System.out.println("[INFO] No hay enemigos en rango (" + rango + ").");
            return;
        }
        System.out.println("[INFO] Objetivos en rango: " + enemigosEnRango.stream().map(Enemigo::getNombre).collect(Collectors.joining(", ")));

        //Seleccionar objetivos para atacar
        List<Enemigo> objetivos = seleccionarObjetivos(enemigosEnRango);

        //Atacar objetivos seleccionados
        if (!objetivos.isEmpty()) {
            System.out.println("[INFO] Objetivos seleccionados: " + objetivos.stream().map(Enemigo::getNombre).collect(Collectors.joining(", ")));
            aplicarAtaqueAObjetivos(objetivos);
        } else {
            System.out.println("[INFO] La seleccion no encontro objetivos validos.");
        }
    }
}
