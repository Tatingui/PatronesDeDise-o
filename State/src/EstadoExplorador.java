public interface EstadoExplorador {

    default void recolectarGema(Explorador explorador) {}

    default void pisarTrampa(Explorador explorador) {}

    default void tomarPocion(Explorador explorador) {}
}