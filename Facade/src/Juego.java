public class Juego{
    public static void main(String[] args) {

        Jugador miHeroe = new Jugador("Arthur", 60, 1);
        FachadaMercader mercader = new FachadaMercader();

        try {
            mercader.comprarItem(miHeroe, "Espada");
            mercader.comprarItem(miHeroe, "Pocion");
        } catch (Exception e) {
            System.out.println("[ERROR] La compra ha fallado: " + e.getMessage());
        }
    }
}