public class Grunido implements UnidadLigera {
    @Override
    public void atacar() {
        System.out.println("Grunido ataca con un hacha afilada.");
    }
    @Override
    public void moverse() {
        System.out.println("Grunido corre al combate.");
    }
}