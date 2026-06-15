public class Caballero implements UnidadLigera {
    @Override
    public void atacar() {
        System.out.println("Caballero ataca con su espada.");
    }
    @Override
    public void moverse() {
        System.out.println("Caballero carga a la batalla.");
    }
}