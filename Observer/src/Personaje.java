import java.util.ArrayList;
import java.util.List;

public class Personaje implements Sujeto {
    private final String nombre;
    private int saludActual;
    private final int saludMaxima;
    private final List<Observador> observadores;

    public Personaje(String nombre, int saludMaxima) {
        this.nombre = nombre;
        this.saludMaxima = saludMaxima;
        this.saludActual = saludMaxima;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void suscribir(Observador observador) {
        observadores.add(observador);
        System.out.println("[SUJETO] Observador suscrito: " + observador.getClass().getSimpleName());
    }

    @Override
    public void desuscribir(Observador observador) {
        observadores.remove(observador);
        System.out.println("[SUJETO] Observador desuscrito: " + observador.getClass().getSimpleName());
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(this);
        }
    }

    public void recibirDano(int cantidad) {
        System.out.println("\n[EVENTO] El personaje " + nombre + " recibio " + cantidad + " puntos de daño.");
        this.saludActual = Math.max(0, this.saludActual - cantidad);

        //Notifica a todos los observadores
        notificarObservadores();
    }

    public void sanar(int cantidad) {
        System.out.println("\n[EVENTO] El personaje " + nombre + " recupero " + cantidad + " puntos de vida.");
        this.saludActual = Math.min(this.saludMaxima, this.saludActual + cantidad);

        //Notifica a todos los observadores
        notificarObservadores();
    }

    public int obtenerSaludActual() {
        return saludActual;
    }

    public int obtenerSaludMaxima() {
        return saludMaxima;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
