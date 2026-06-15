//"La implementación"
public interface Dispositivo {

    boolean estaPrendida();

    void prender();

    void apagar();

    int obtenerVolumen();

    void setVolumen(int volumen);

    int obtenerCanal();

    void setCanal(int canal);

    void mostrarEstado();
}
