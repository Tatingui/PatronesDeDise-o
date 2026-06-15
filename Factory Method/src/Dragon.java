public class Dragon implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El dragon lanza una bola de fuego.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Dragon: Un enemigo temible y poderoso.");
    }
}