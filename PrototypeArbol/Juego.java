// Juego.java - Cliente
public class Juego {
    public static void main(String[] args) {

        RegistroArboles registro = new RegistroArboles();

        System.out.println("=== CARGA INICIAL (solo ocurre una vez) ===");
        registro.registrar("pino", new ArbolPino());
        registro.registrar("roble", new ArbolRoble());

        System.out.println("\n=== GENERANDO BOSQUE (clonacion rapida) ===");

        // 3 pinos con variaciones
        Arbol p1 = registro.obtenerClon("pino")
                .setPosicion(10, 5)
                .setEscala(1.2f)
                .setRotacion(45f);

        Arbol p2 = registro.obtenerClon("pino")
                .setPosicion(15, 8)
                .setEscala(0.9f)
                .setRotacion(120f)
                .setColorHojas("Verde oscuro");

        Arbol p3 = registro.obtenerClon("pino")
                .setPosicion(20, 3)
                .setEscala(1.5f)
                .setRotacion(200f);

        // 2 robles con variaciones
        Arbol r1 = registro.obtenerClon("roble")
                .setPosicion(30, 10)
                .setEscala(1.1f)
                .setColorHojas("Amarillo otoño");

        Arbol r2 = registro.obtenerClon("roble")
                .setPosicion(35, 6)
                .setEscala(0.8f)
                .setRotacion(90f)
                .setColorHojas("Naranja otoño");

        System.out.println("\n=== ESTADO DEL BOSQUE ===");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        r1.mostrarInfo();
        r2.mostrarInfo();
    }
}