public class SistemaInventario {

    public void verificarEspacio(Jugador jugador) throws InventarioLlenoException {
        if (jugador.getEspacioLibreInventario() <= 0) {
            throw new InventarioLlenoException("El inventario está lleno.");
        }
    }

    public void agregarItem(Jugador jugador, String item) {
        jugador.ocuparEspacioInventario();
        System.out.println("[+] Se añadió '" + item + "' al inventario.");
    }
}