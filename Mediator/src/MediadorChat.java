public interface MediadorChat {

    void registrarJugador(Jugador jugador);

    void enviarMensajeGlobal(Jugador remitente, String mensaje);

    void enviarMensajePrivado(Jugador remitente, String destinatario, String mensaje);

    void enviarMensajeEquipo(Jugador remitente, String mensaje);

}
