// NivelComportamiento.java - Jerarquía Bridge
public interface NivelComportamiento {
    int calcularDano(int danoBase);
    int calcularSalud(int saludBase);
    String obtenerRango();
}