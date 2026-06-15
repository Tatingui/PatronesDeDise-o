public class Juego {
    public static void main(String[] args) {

        Television Tv = new Television();

        ControlRemoto controlBasico = new ControlRemotoBasico(Tv);


        controlBasico.power();

        controlBasico.subirVolumen();

        controlBasico.bajarCanal();

        System.out.println("\n--- --- ---\n");

        Tv.mostrarEstado();


        ControlRemotoAmplio controlAmplio = new ControlRemotoAmplio(Tv);

        controlAmplio.mutear();

        controlAmplio.zapping();

        System.out.println("\n--- --- ---\n");

        Tv.mostrarEstado();


        controlAmplio.power();

        System.out.println("\n--- --- ---\n");

        Tv.mostrarEstado();
    }
}