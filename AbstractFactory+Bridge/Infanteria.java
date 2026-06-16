// Infanteria.java
public class Infanteria extends Unidad {
    public Infanteria(String raza, NivelComportamiento nivel) {
        super("Infanteria", raza, 20, 100, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("[" + raza + "] Infanteria ataca cuerpo a cuerpo. Daño: "
                + nivel.calcularDano(danoBase));
    }
}