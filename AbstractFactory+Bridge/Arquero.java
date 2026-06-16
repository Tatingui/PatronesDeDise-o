// Arquero.java
public class Arquero extends Unidad {
    public Arquero(String raza, NivelComportamiento nivel) {
        super("Arquero", raza, 15, 70, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("[" + raza + "] Arquero dispara una flecha. Daño: "
                + nivel.calcularDano(danoBase));
    }
}