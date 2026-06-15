import java.util.HashMap;
import java.util.Map;

public class CatalogoTienda {

    private final Map<String, Integer> precios;

    public CatalogoTienda() {
        precios = new HashMap<>();
        precios.put("Espada", 50);
        precios.put("Pocion", 10);
    }

    public int consultarPrecio(String item) throws ItemNoExisteException {
        if (!precios.containsKey(item)) {
            throw new ItemNoExisteException("El mercader no vende el ítem: " + item);
        }

        return precios.get(item);
    }
}