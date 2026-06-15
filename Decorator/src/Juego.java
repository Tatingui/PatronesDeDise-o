import java.text.DecimalFormat;

public class Juego {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void mostrarArma(String titulo, Arma arma) {
        System.out.println("\n- " + titulo + " -\n");
        System.out.println("- Descripcion: " + arma.obtenerDescripcion());
        System.out.println("- Daño: " + arma.obtenerDanio());
        System.out.println("- Precision: " + df.format(arma.obtenerPrecision()));
        System.out.println("- Capacidad: " + arma.obtenerCapacidadCargador());
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Arma miPistola = new PistolaSimple();

        mostrarArma("Pistola base", miPistola);

        Arma armaSilenciada = new Silenciador(miPistola);

        mostrarArma("Pistola con silenciador", armaSilenciada);

        Arma armaSemiCompleta = new CargadorExtendido(armaSilenciada);
        Arma armaCompleta = new Mira(armaSemiCompleta);

        mostrarArma("Pistola con todas las mejoras", armaCompleta);

    }
}