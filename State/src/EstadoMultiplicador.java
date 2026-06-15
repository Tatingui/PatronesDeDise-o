public class EstadoMultiplicador implements EstadoExplorador {

    @Override
    public void recolectarGema(Explorador explorador) {
        System.out.println("El explorador recoge gemas al doble de velocidad.");
        explorador.sumarGemas(2);
    }

    @Override
    public void pisarTrampa(Explorador explorador) {
        System.out.println("El estado multiplicador se pierde por pisar una trampa y queda inmovilizado.");
        explorador.establecerEstado(new EstadoInmovilizado());
    }

    // No sobrescribimos tomarPocion(). Si toma otra, no hace nada.
}