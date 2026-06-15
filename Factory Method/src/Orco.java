public class Orco implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El orco blande un pesado mazo.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Orco: Un enemigo fuerte pero lento.");
    }
}