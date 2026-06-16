// ArbolPino.java - Prototipo concreto
public class ArbolPino extends Arbol {

    public ArbolPino() {
        super("pino_modelo.obj", "pino_textura.png");
    }

    // Constructor de copia privado, solo usado por clonar()
    private ArbolPino(ArbolPino otro) {
        super(otro); // llama al constructor de copia de Arbol
    }

    @Override
    public Arbol clonar() {
        return new ArbolPino(this); // se pasa a si mismo como fuente
    }
}