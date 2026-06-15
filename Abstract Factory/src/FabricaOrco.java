// Fábrica para crear unidades Orcas

public class FabricaOrco implements FabricaDeUnidades {
    @Override
    public UnidadLigera crearUnidadLigera() {
        return new Grunido();
    }
    @Override
    public UnidadPesada crearUnidadPesada() {
        return new Chaman();
    }
}