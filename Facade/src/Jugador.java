public class Jugador {
    private String nombre;
    private int oro;
    private int espacioLibreInventario;

    public Jugador(String nombre, int oro, int espacio) {
        this.nombre = nombre;
        this.oro = oro;
        this.espacioLibreInventario = espacio;
    }

    public int getOro() {
        return oro;
    }

    public int getEspacioLibreInventario() {
        return espacioLibreInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void descontarOro(int cantidad) {
        this.oro -= cantidad;
    }

    public void aumentarOro(int cantidad) {
        this.oro += cantidad;
    }

    public void ocuparEspacioInventario() {
        this.espacioLibreInventario--;
    }

    public void liberarEspacioInventario() {
        this.espacioLibreInventario--;
    }
}