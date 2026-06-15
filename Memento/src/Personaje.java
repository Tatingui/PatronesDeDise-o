//Originador (Originator)
public class Personaje {

    private int salud;
    private int nivel;
    private Coordenada coordenada;

    public Personaje(int salud, int nivel, Coordenada coordenada) {
        this.salud = salud;
        this.nivel = nivel;
        this.coordenada = coordenada;
    }

    public void recibirDano(int dano) {
        this.salud -= dano;
        System.out.println("[PERSONAJE] Recibio " + dano);
    }

    public void moverse(int x, int y, int z) {
        this.coordenada = new Coordenada(x, y, z);
        System.out.println("[PERSONAJE] Moviendose a " + this.coordenada);
    }

    public void subirNivel() {
        this.nivel += 1;
        System.out.println("[PERSONAJE] Subio a nivel " + this.nivel);
    }

    public void mostrarEstado() {
        System.out.println("/// ESTADO ACTUAL ///");
        System.out.println("- Nivel: " + nivel);
        System.out.println("- Salud: " + salud);
        System.out.println("- Posicion: " + coordenada.toString());
        System.out.println("---------------------");
    }

    public Memento guardarEstado(String nombreAccion) {
        return new Memento(this.salud, this.nivel, this.coordenada, nombreAccion);
    }

    public void restaurarEstado(Memento recuerdo) {
        this.salud = recuerdo.obtenerSalud();
        this.nivel = recuerdo.obtenerNivel();
        this.coordenada = recuerdo.obtenerPosicion();
        System.out.println("[CARGAR] Estado restaurado: " + recuerdo.obtenerNombreAccion());
    }
}
