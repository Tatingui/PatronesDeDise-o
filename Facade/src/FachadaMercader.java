public class FachadaMercader {

    private final CatalogoTienda catalogo;
    private final SistemaEconomia economia;
    private final SistemaInventario inventario;

    public FachadaMercader() {
        this.catalogo = new CatalogoTienda();
        this.economia = new SistemaEconomia();
        this.inventario = new SistemaInventario();
    }

    public void comprarItem(Jugador jugador, String item) throws Exception {
        System.out.println("\n- Intentando comprar: " + item + "...");

        int precio = catalogo.consultarPrecio(item);

        this.inventario.verificarEspacio(jugador);
        this.economia.cobrar(jugador, precio);
        this.inventario.agregarItem(jugador, item);

        System.out.println(
                "Compra exitosa. Oro restante de "
                        + jugador.getNombre()
                        + ": "
                        + jugador.getOro()
        );
    }
}