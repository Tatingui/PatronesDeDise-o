public class EstadoInmovilizado implements EstadoExplorador {

    // NO sobrescribimos recolectarGema(). No puede recolectar.

    // NO sobrescribimos pisarTrampa(). Ya esta en una trampa.

    @Override
    public void tomarPocion(Explorador explorador) {
        System.out.println("El explorador usa la poción para liberarse y vuelve a la normalidad.");
        explorador.establecerEstado(new EstadoNormal());
    }
}