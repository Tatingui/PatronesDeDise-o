
// RegistroEnemigos.java
import java.util.HashMap;
import java.util.Map;

public class RegistroEnemigos {
    private Map<String, Enemigo> prototipos = new HashMap<>();

    // Registra un prototipo en el mapa
    public void registrar(String clave, Enemigo prototipo) {
        prototipos.put(clave, prototipo);
    }

    // Retorna un clon del prototipo guardado
    public Enemigo obtenerClon(String clave) {
        Enemigo prototipo = prototipos.get(clave);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        return null;
    }
}
