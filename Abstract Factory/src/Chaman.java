public class Chaman implements UnidadPesada {
    @Override
    public void atacar() {
        System.out.println("Chaman ataca con magia oscura.");
    }
    @Override
    public void defender() {
        System.out.println("Chaman invoca un escudo de huesos para defender.");
    }
}