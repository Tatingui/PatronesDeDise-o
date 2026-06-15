import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//El Adaptado
public class SistemaLogAntiguo {
    private final String nombreArchivo;

    public SistemaLogAntiguo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        System.out.println("SistemaLogAntiguo inicializado para " + nombreArchivo);
    }

    public void escribirLinea(String lineaDeTexto) {
        try (FileWriter fileWriter = new FileWriter(nombreArchivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(lineaDeTexto);
            System.out.println("[SistemaLogAntiguo] Linea añadida al archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}