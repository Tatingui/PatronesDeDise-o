// Goblin.java - Prototipo concreto
public class Goblin extends Enemigo {

    public Goblin(String nombre, int salud, int dano, String habilidad) {
        super(nombre, salud, dano, habilidad);
    }

    @Override
    public Enemigo clonar() {
        return new Goblin(this.nombre, this.salud, this.dano, this.habilidad);
    }
}