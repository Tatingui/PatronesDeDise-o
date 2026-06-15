import java.util.EmptyStackException;
import java.util.Stack;

//Guardián (Caretaker)
public class GestorDePartidas {

    private final Stack<Memento> historial;
    private final Stack<Memento> historialDeshecho;
    private Personaje personaje;

    public GestorDePartidas(Personaje player) {
        this.personaje = player;
        this.historial = new Stack<>();
        this.historialDeshecho = new Stack<>();

        // Estado inicial
        guardarAccion("Inicio del juego");
    }

    public void guardarAccion(String nombreAccion) {
        Memento recuerdo = personaje.guardarEstado(nombreAccion);
        historial.push(recuerdo);
        historialDeshecho.clear();
        System.out.println("[GESTOR] Accion '" + nombreAccion + "' guardada");
    }

    public void deshacer() {
        if (historial.size() <= 1) {
            System.out.println("[UNDO] No hay acciones previas que deshacer");
            return;
        }

        try {
            Memento estadoActual = historial.pop();
            historialDeshecho.push(estadoActual);

            Memento estadoAnterior = historial.peek();
            personaje.restaurarEstado(estadoAnterior);

            System.out.println("[UNDO] Deshecha la accion: " + estadoActual.obtenerNombreAccion());

        } catch (EmptyStackException e) {
            System.out.println("[UNDO] Error en la gestion de la pila");
        }
    }

    public void rehacer() {
        if (historialDeshecho.isEmpty()) {
            System.out.println("[REDO] No hay acciones deshechas para rehacer");
            return;
        }

        Memento estadoRehecho = historialDeshecho.pop();
        historial.push(estadoRehecho);
        personaje.restaurarEstado(estadoRehecho);

        System.out.println("[REDO] Rehecha la accion: " + estadoRehecho.obtenerNombreAccion());
    }
}
