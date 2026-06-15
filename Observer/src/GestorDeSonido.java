import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class GestorDeSonido implements Observador {
    private static GestorDeSonido instancia;
    private int registroUltimaSalud;

    private GestorDeSonido() {
        this.registroUltimaSalud = 0;
    }

    public static GestorDeSonido getInstancia() {
        if (instancia == null) {
            instancia = new GestorDeSonido();
        }
        return instancia;
    }

    @Override
    public void actualizar(Personaje personaje) {
        if (registroUltimaSalud == 0) {
            registroUltimaSalud = personaje.obtenerSaludMaxima();
        }

        int saludActual = personaje.obtenerSaludActual();

        if (saludActual < registroUltimaSalud) {
            generarTono(400, 300);
        } else if (saludActual > registroUltimaSalud) {
            generarTono(1200, 150);
        }

        registroUltimaSalud = saludActual;
    }

    private void generarTono(int hz, int msecs) {
        try {
            float sampleRate = 8000f;
            byte[] buf = new byte[1];
            AudioFormat af = new AudioFormat(sampleRate, 8, 1, true, false);
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);

            sdl.open(af);
            sdl.start();

            for (int i = 0; i < msecs * 8; i++) {
                double angle = i / (sampleRate / hz) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * 127.0);
                sdl.write(buf, 0, 1);
            }

            sdl.drain();
            sdl.stop();
            sdl.close();

        } catch (Exception e) {
            System.err.println("No se pudo reproducir el sonido: " + e.getMessage());
        }
    }
}