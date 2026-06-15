public class Jugador {

    private MediadorChat mediador; //Solo conoce al Mediador para comunicarse
    private String nombre;
    private Equipo equipo;

    public Jugador(MediadorChat mediador, String nombre, Equipo equipo) {
        this.mediador = mediador;
        this.nombre = nombre;
        this.equipo = equipo;
        this.mediador.registrarJugador(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void chatearGlobal(String mensaje) {
        System.out.println(">> [" + nombre + " GLOBAL]: " + mensaje);
        mediador.enviarMensajeGlobal(this, mensaje);
    }

    public void chatearPrivado(String destinatario, String mensaje) {
        System.out.println(">> [" + nombre + " PRIVADO a " + destinatario + "]: " + mensaje);
        mediador.enviarMensajePrivado(this, destinatario, mensaje);
    }

    public void chatearEquipo(String mensaje) {
        System.out.println(">> [" + nombre + " EQUIPO " + equipo + "]: " + mensaje);
        mediador.enviarMensajeEquipo(this, mensaje);
    }

    public void recibirMensaje(String remitente, String mensaje, String tipo) {
        System.out.println("[" + nombre + " recibe - " + tipo + "] " + remitente + ": " + mensaje);
    }
}
