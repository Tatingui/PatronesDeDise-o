public class Paladin implements UnidadPesada {
    @Override
    public void atacar() {
        System.out.println("Paladin ataca con su martillo de guerra.");
    }
    @Override
    public void defender() {
        System.out.println("Paladin usa su escudo de luz para defender.");
    }
}