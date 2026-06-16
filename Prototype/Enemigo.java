// Enemigo.java - Prototype
public abstract class Enemigo implements Cloneable {
    protected String nombre;
    protected int salud;
    protected int dano;
    protected String habilidad;

    public Enemigo(String nombre, int salud, int dano, String habilidad) {
        this.nombre = nombre;
        this.salud = salud;
        this.dano = dano;
        this.habilidad = habilidad;
    }

    public abstract Enemigo clonar();

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Salud: " + salud
                + " | Daño: " + dano + " | Habilidad: " + habilidad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}