public final class Memento { //Objeto inmutable

    private final int salud;
    private final int nivel;
    private final Coordenada posicion;
    private final String nombreAccion;

    Memento(int salud, int nivel, Coordenada posicion, String nombreAccion) {
        this.salud = salud;
        this.nivel = nivel;
        this.posicion = posicion;
        this.nombreAccion = nombreAccion;
    }

    int obtenerSalud() {
        return salud;
    }

    int obtenerNivel() {
        return nivel;
    }

    Coordenada obtenerPosicion() {
        return posicion;
    }

    String obtenerNombreAccion() {
        return nombreAccion;
    }

    @Override
    public String toString() {
        return "Nivel: " + nivel + ", Salud: " + salud + ", Posicion: " + posicion.toString();
    }

}
