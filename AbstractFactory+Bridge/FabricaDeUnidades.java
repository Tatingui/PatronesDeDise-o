// FabricaDeUnidades.java - Abstract Factory
public interface FabricaDeUnidades {
    Unidad crearInfanteria(NivelComportamiento nivel);

    Unidad crearArquero(NivelComportamiento nivel);
}