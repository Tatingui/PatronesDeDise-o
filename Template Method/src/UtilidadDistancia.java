import java.lang.Math;

public class UtilidadDistancia {

    public static double calcularDistancia(int tx, int ty, Enemigo e) {
        return Math.sqrt(Math.pow(tx - e.getX(), 2) + Math.pow(ty - e.getY(), 2));
    }

}