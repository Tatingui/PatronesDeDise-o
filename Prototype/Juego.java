public class Juego {
    public static void main(String[] args) {
        // 1. Crear el registro
        RegistroEnemigos registro = new RegistroEnemigos();

        // 2. Registrar los prototipos (esto solo se hace una vez al inicio)
        registro.registrar("GoblinBasico", new Goblin("Goblin", 50, 10, "Robar oro"));
        registro.registrar("DragonFuego", new Dragon("Dragon", 500, 100, "Aliento de fuego"));

        // 3. Obtener clones y usarlos en el juego
        Enemigo g1 = registro.obtenerClon("GoblinBasico");
        Enemigo d1 = registro.obtenerClon("DragonFuego");

        // 4. Modificar el clon (personalización)
        g1.setNombre("Goblin Escurridizo");

        // 5. Mostrar resultados
        System.out.println("--- Enemigos en escena ---");
        g1.mostrarInfo();
        d1.mostrarInfo();
    }
}