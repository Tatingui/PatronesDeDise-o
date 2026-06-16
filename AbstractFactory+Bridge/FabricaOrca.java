// FabricaOrca.java
public class FabricaOrca implements FabricaDeUnidades {
    @Override
    public Unidad crearInfanteria(NivelComportamiento nivel) {
        return new Infanteria("Orco", nivel);
    }

    @Override
    public Unidad crearArquero(NivelComportamiento nivel) {
        return new Arquero("Orco", nivel);
    }
}