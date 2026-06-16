// Juego.java - Cliente
public class Juego {
    public static void main(String[] args) {

        // Guerrero con todas las opciones
        Personaje guerrero = new Personaje.Builder("Arthas", "Guerrero")
                .salud(200)
                .mana(20)
                .arma("Espadón de dos manos")
                .armadura("Armadura de placas")
                .habilidadEspecial("Golpe aturdidor")
                .build();

        // Mago solo con lo esencial
        Personaje mago = new Personaje.Builder("Gandalf", "Mago")
                .mana(300)
                .arma("Baston magico")
                .habilidadEspecial("Bola de fuego")
                .build();

        guerrero.mostrarStats();
        System.out.println();
        mago.mostrarStats();
    }
}