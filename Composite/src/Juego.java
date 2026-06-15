public class Juego {
    public static void main(String[] args) {

        ComponenteMilitar s1 = new UnidadSoldado("Max", "Cabo");
        ComponenteMilitar s2 = new UnidadSoldado("Lena", "Cabo");
        ComponenteMilitar s3 = new UnidadSoldado("Kael", "Sargento");
        ComponenteMilitar s4 = new UnidadSoldado("Ziva", "Cabo primero");

        Escuadron equipoAlfa = new Escuadron("Alfa");
        Escuadron equipoBeta = new Escuadron("Beta");
        Escuadron comandoCentral = new Escuadron("Comando Central");

        equipoAlfa.agregarComponente(s1);
        equipoAlfa.agregarComponente(s2);

        equipoBeta.agregarComponente(s3);
        equipoBeta.agregarComponente(s4);

        comandoCentral.agregarComponente(equipoAlfa);
        comandoCentral.agregarComponente(equipoBeta);

        System.out.println("\n--- ORDEN AL ESCUADRON COMPLETO ---");

        comandoCentral.ejecutarOrden("ATACAR OBJETIVO");

        System.out.println("\n--- ORDEN A UN SOLO ESCUADRON ---");

        equipoBeta.ejecutarOrden("MANTENER POSICION");

        System.out.println("\n--- ELIMINACION DE COMPONENTE Y NUEVA ORDEN ---");

        equipoAlfa.eliminarComponente(s2);

        comandoCentral.ejecutarOrden("REAGRUPARSE");
    }
}