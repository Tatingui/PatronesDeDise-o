import java.time.LocalDateTime;

//La clase moderna
public class LogroAlcanzado {
    private final LocalDateTime fecha;
    private final int IDJugador;
    private final String descripcionLogro;

    public LogroAlcanzado(int IDJugador, String descripcionLogro) {
        this.fecha = LocalDateTime.now();
        this.IDJugador = IDJugador;
        this.descripcionLogro = descripcionLogro;
    }

    public LocalDateTime getFecha() { return fecha; }
    public int getIDJugador() { return IDJugador; }
    public String getDescripcionLogro() { return descripcionLogro; }
}