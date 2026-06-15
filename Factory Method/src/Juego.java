public class Juego {

    public static void main(String[] args) {
        CreadorEnemigo creador;

        System.out.println("Nivel 1");
        creador = new CreadorDuende();
        Enemigo enemigoLvl1 = creador.crearEnemigo();
        enemigoLvl1.mostrarInfo();
        enemigoLvl1.atacar();

        System.out.println("\nNivel 2");
        creador = new CreadorOrco();
        Enemigo enemigoLvl2 = creador.crearEnemigo();
        enemigoLvl2.mostrarInfo();
        enemigoLvl2.atacar();

        System.out.println("\nNivel 3");
        creador = new CreadorDragon();
        Enemigo enemigoLvl3 = creador.crearEnemigo();
        enemigoLvl3.mostrarInfo();
        enemigoLvl3.atacar();
    }
}