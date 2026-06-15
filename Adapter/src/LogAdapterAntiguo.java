import java.time.format.DateTimeFormatter;

//El Adaptador
public class LogAdapterAntiguo implements ILoggerEstructurado {

    private final SistemaLogAntiguo sistemaAntiguo;
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public LogAdapterAntiguo(SistemaLogAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void registrarLogro(LogroAlcanzado logro) {
        System.out.println("[ADAPTER] Logro recibido.");

        String fechaFormateada = logro.getFecha().format(FORMATO_FECHA);

        String lineaLog = String.format("%s;%d;%s", fechaFormateada, logro.getIDJugador(), logro.getDescripcionLogro());

        sistemaAntiguo.escribirLinea(lineaLog);
        System.out.println("[ADAPTER] Traduccion y registro finalizados.");
    }
}