// Dragon.java - Prototipo concreto
public class Dragon extends Enemigo {

    public Dragon(String nombre, int salud, int dano, String habilidad) {
        super(nombre, salud, dano, habilidad);
    }

    @Override
    public Enemigo clonar() {
        return new Dragon(this.nombre, this.salud, this.dano, this.habilidad);
    }
}