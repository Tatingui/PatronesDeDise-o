public class Enemigo {

    private String nombre;
    private int salud;
    private int velocidad;
    private int x;
    private int y;

    public Enemigo(String nombre, int salud, int velocidad, int x, int y) {
        this.nombre = nombre;
        this.salud = salud;
        this.velocidad = velocidad;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void recibirDano(int dano) {
        this.salud = Math.max(0, this.salud - dano);
        System.out.println("[IMPACTO] " + nombre + " recibe " + dano + " daño. HP restante: " + this.salud + ".");
    }

    public void reducirVelocidad(int reduccion) {
        this.velocidad = Math.max(1, this.velocidad - reduccion);
        System.out.println("[IMPACTO] " + nombre + " ralentizado. Nueva velocidad: " + this.velocidad + ".");
    }

}
