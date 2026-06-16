// FabricaHumana.java
public class FabricaHumana implements FabricaDeUnidades {
    @Override
    public Unidad crearInfanteria(NivelComportamiento nivel) {
        return new Infanteria("Humano", nivel);
    }

    @Override
    public Unidad crearArquero(NivelComportamiento nivel) {
        return new Arquero("Humano", nivel);
    }
}