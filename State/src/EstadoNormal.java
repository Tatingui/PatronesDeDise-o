public class EstadoNormal implements EstadoExplorador {

    @Override
    public void recolectarGema(Explorador explorador) {
        System.out.println("El explorador recoge una gema normal.");
        explorador.sumarGemas(1);
    }

    @Override
    public void pisarTrampa(Explorador explorador) {
        System.out.println("El explorador pisa una trampa y queda inmovilizado.");
        explorador.establecerEstado(new EstadoInmovilizado());
    }

    @Override
    public void tomarPocion(Explorador explorador) {
        System.out.println("El explorador bebe una pocion y entra en estado multiplicador.");
        explorador.establecerEstado(new EstadoMultiplicador());
    }
}