import javax.sound.sampled.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GestorDeSonido {

    private static GestorDeSonido instanciaUnica;
    private final Map<String, Clip> clipsCargados;

    //Constructor privado
    private GestorDeSonido() {
        this.clipsCargados = new HashMap<>();
    }

    //Método estático para obtener la única instancia
    public static GestorDeSonido obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new GestorDeSonido();
        }
        return instanciaUnica;
    }

    public void cargarSonido(String nombre, String rutaArchivo) {
        if (clipsCargados.containsKey(nombre)) {
            System.out.println("El sonido '" + nombre + "' ya esta cargado.");
            return;
        }

        try {
            File archivoSonido = new File(rutaArchivo);
            AudioInputStream flujoAudio = AudioSystem.getAudioInputStream(archivoSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(flujoAudio);
            clipsCargados.put(nombre, clip);
            System.out.println("Sonido '" + nombre + "' cargado con exito desde: " + rutaArchivo);
        } catch (Exception e) {
            System.err.println("Error al cargar el sonido '" + nombre + "': " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void reproducirSonido(String nombre) {
        Clip clip = clipsCargados.get(nombre);
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        } else {
            System.out.println("Error: Sonido '" + nombre + "' no encontrado.");
        }
    }
}