public class Coordenada {

    private final int x;
    private final int y;
    private final int z;

    public Coordenada(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }

    public int obtenerZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(X:" + x + ", Y:" + y + ", Z:" + z + ")";
    }

}
