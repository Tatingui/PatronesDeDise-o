public class Explorador {

    private EstadoExplorador estadoActual;
    private int cantidadGemas;

    public Explorador() {
        this.estadoActual = new EstadoNormal();
        this.cantidadGemas = 0;
    }

    public void establecerEstado(EstadoExplorador nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void intentarRecolectar() {
        estadoActual.recolectarGema(this);
    }

    public void caerEnTrampa() {
        estadoActual.pisarTrampa(this);
    }

    public void beberPocion() {
        estadoActual.tomarPocion(this);
    }

    public void sumarGemas(int cantidad) {
        this.cantidadGemas += cantidad;
        System.out.println("-> Recolecta " + cantidad + " gemas... Total: " + this.cantidadGemas);
    }
}