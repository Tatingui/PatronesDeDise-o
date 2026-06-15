public class Duende implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El duende ataca con una daga pequeña.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Duende: Un enemigo debil pero agil.");
    }
}