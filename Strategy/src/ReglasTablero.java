public class ReglasTablero {
    public static boolean estaEnRango(Coordenada c) {
        return c.x >= 1 && c.x <= 8 && c.y >= 1 && c.y <= 8;
    }
}
