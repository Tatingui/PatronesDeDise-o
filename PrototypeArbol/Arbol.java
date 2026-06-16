// Arbol.java - Prototype abstracto
public abstract class Arbol {
    protected String modelo;      // el mesh 3D (costoso de cargar)
    protected String textura;     // textura base
    protected float escala;
    protected float rotacion;
    protected String colorHojas;
    protected float posX;
    protected float posY;

    public Arbol(String modelo, String textura) {
        this.modelo = modelo;
        this.textura = textura;
        // Simulamos que cargar el modelo 3D es costoso
        System.out.println("[MEMORIA] Cargando modelo 3D: " + modelo + "... (operacion costosa)");
        this.escala = 1.0f;
        this.rotacion = 0.0f;
        this.colorHojas = "Verde";
        this.posX = 0;
        this.posY = 0;
    }

    // Constructor de copia - usado internamente por clonar()
    public Arbol(Arbol otro) {
        this.modelo = otro.modelo;      // reutiliza referencia al modelo
        this.textura = otro.textura;    // reutiliza referencia a textura
        this.escala = otro.escala;
        this.rotacion = otro.rotacion;
        this.colorHojas = otro.colorHojas;
        this.posX = otro.posX;
        this.posY = otro.posY;
        System.out.println("[MEMORIA] Clonado rapido, sin recargar modelo.");
    }

    public abstract Arbol clonar();

    // Setters que retornan this para encadenar (similar al Builder)
    public Arbol setPosicion(float x, float y) {
        this.posX = x;
        this.posY = y;
        return this;
    }

    public Arbol setEscala(float escala) {
        this.escala = escala;
        return this;
    }

    public Arbol setRotacion(float rotacion) {
        this.rotacion = rotacion;
        return this;
    }

    public Arbol setColorHojas(String color) {
        this.colorHojas = color;
        return this;
    }

    public void mostrarInfo() {
        System.out.println("Arbol [" + modelo + "] pos:(" + posX + "," + posY
                + ") escala:" + escala + " rot:" + rotacion
                + " color:" + colorHojas);
    }
}