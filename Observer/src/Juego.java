public class Juego {
    public static void main(String[] args) {

        Personaje snake = new Personaje("Snake", 100);

        BarraDeSaludHUD barraHUD = BarraDeSaludHUD.getInstancia();
        GestorDeSonido gestorSonido = GestorDeSonido.getInstancia();

        snake.suscribir(barraHUD);
        snake.suscribir(gestorSonido);

        System.out.println("\n* * * INICIO DE MISIÓN * * *");

        System.out.println("\nRECIBE DAÑO");
        snake.recibirDano(20);

        System.out.println("\nSE CURA");
        snake.sanar(10);

        System.out.println("\nRECIBE DAÑO");
        snake.recibirDano(30);
    }
}