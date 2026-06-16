// ArbolRoble.java - Prototipo concreto
public class ArbolRoble extends Arbol {

    public ArbolRoble() {
        super("roble_modelo.obj", "roble_textura.png");
    }

    private ArbolRoble(ArbolRoble otro) {
        super(otro);
    }

    @Override
    public Arbol clonar() {
        return new ArbolRoble(this);
    }
}