
// RegistroArboles.java - Registro de prototipos
import java.util.HashMap;
import java.util.Map;

public class RegistroArboles {
    private final Map<String, Arbol> prototipos = new HashMap<>();

    public void registrar(String clave, Arbol arbol) {
        prototipos.put(clave, arbol);
    }

    public Arbol obtenerClon(String clave) {
        Arbol prototipo = prototipos.get(clave);
        if (prototipo == null) {
            throw new IllegalArgumentException("Prototipo no encontrado: " + clave);
        }
        return prototipo.clonar();
    }
}