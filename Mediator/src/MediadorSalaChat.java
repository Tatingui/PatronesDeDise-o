import java.util.HashMap;
import java.util.Map;

//Implementación concreta
public class MediadorSalaChat implements MediadorChat {

    private Map<String, Jugador> jugadoresRegistrados;

    public MediadorSalaChat() {
        this.jugadoresRegistrados = new HashMap<>();
    }

    @Override
    public void registrarJugador(Jugador jugador) {
        jugadoresRegistrados.put(jugador.getNombre(), jugador);
    }

    @Override
    public void enviarMensajeGlobal(Jugador remitente, String mensaje) {
        for (Jugador destinatario : jugadoresRegistrados.values()) {
            if (destinatario != remitente) {
                destinatario.recibirMensaje(remitente.getNombre(), mensaje, "GLOBAL");
            }
        }
    }

    @Override
    public void enviarMensajePrivado(Jugador remitente, String destinatarioNombre, String mensaje) {
        Jugador destinatario = jugadoresRegistrados.get(destinatarioNombre);
        if (destinatario == null) {
            System.out.println("[ERROR] El jugador " + destinatarioNombre + " no fue encontrado.");
            return;
        }
        destinatario.recibirMensaje(remitente.getNombre(), mensaje, "PRIVADO");
    }

    @Override
    public void enviarMensajeEquipo(Jugador remitente, String mensaje) {
        Equipo equipoRemitente = remitente.getEquipo();
        for (Jugador destinatario : jugadoresRegistrados.values()) {
            if (destinatario.getEquipo().equals(equipoRemitente) && destinatario != remitente) {
                destinatario.recibirMensaje(remitente.getNombre(), mensaje, "EQUIPO");
            }
        }
    }
}