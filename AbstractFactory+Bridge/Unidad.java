// Unidad.java - Abstracción Bridge
public abstract class Unidad {
    protected String nombre;
    protected String raza;
    protected int danoBase;
    protected int saludBase;
    protected NivelComportamiento nivel; // PUENTE

    public Unidad(String nombre, String raza,
            int danoBase, int saludBase,
            NivelComportamiento nivel) {
        this.nombre = nombre;
        this.raza = raza;
        this.danoBase = danoBase;
        this.saludBase = saludBase;
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void mostrarInfo() {
        System.out.println("[" + raza + "] " + nombre
                + " | Rango: " + nivel.obtenerRango()
                + " | Daño: " + nivel.calcularDano(danoBase)
                + " | Salud: " + nivel.calcularSalud(saludBase));
    }
}