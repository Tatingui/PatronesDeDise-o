// Fábrica para crear unidades Humanas

public class FabricaHumana implements FabricaDeUnidades {
    @Override
    public UnidadLigera crearUnidadLigera() {
        return new Caballero();
    }
    @Override
    public UnidadPesada crearUnidadPesada() {
        return new Paladin();
    }
}