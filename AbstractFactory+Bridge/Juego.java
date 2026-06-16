// Juego.java
public class Juego {
    public static void main(String[] args) {

        // Abstract Factory garantiza consistencia de raza
        FabricaDeUnidades fabrica = new FabricaHumana();

        // Bridge maneja los niveles sin explotar en subclases
        Unidad infanteriaBasica = fabrica.crearInfanteria(new NivelBasico());
        Unidad arqueroElite = fabrica.crearArquero(new NivelElite());

        System.out.println("=== EJERCITO HUMANO ===");
        infanteriaBasica.mostrarInfo();
        infanteriaBasica.atacar();

        arqueroElite.mostrarInfo();
        arqueroElite.atacar();

        System.out.println("\n=== EJERCITO ORCO ===");
        FabricaDeUnidades fabricaOrca = new FabricaOrca();
        Unidad infanteriaOrcaElite = fabricaOrca.crearInfanteria(new NivelElite());
        infanteriaOrcaElite.mostrarInfo();
        infanteriaOrcaElite.atacar();
    }
}