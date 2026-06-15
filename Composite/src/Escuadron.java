import java.util.ArrayList;
import java.util.List;

public class Escuadron implements ComponenteMilitar, GestorComponentes {
    private final String nombre;
    private final List<ComponenteMilitar> componentes;

    public Escuadron(String nombre) {
        this. componentes = new ArrayList<>();
        this.nombre = nombre;
    }

    @Override
    public void ejecutarOrden(String orden) {
        System.out.println("[ESCUADRON] El " + nombre + " ha recibido la orden: " + orden);
        for (ComponenteMilitar componente : componentes) {
            componente.ejecutarOrden(orden);
        }
    }

    @Override
    public void agregarComponente(ComponenteMilitar componente) {
        componentes.add(componente);
        System.out.println("-> " + componente.obtenerNombre() + " se ha unido a " + nombre);
    }

    @Override
    public void eliminarComponente(ComponenteMilitar componente) {
        componentes.remove(componente);
        System.out.println("-> " + componente.obtenerNombre() + " ha sido removido de " + nombre);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}