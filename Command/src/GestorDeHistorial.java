import java.util.Stack;

//Invocador
public class GestorDeHistorial {

    private final Stack<Comando> historial = new Stack<>();

    public void ejecutarYGuardar(Comando comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            Comando ultimoComando = historial.pop();
            ultimoComando.desHacer();
        }
    }
}
