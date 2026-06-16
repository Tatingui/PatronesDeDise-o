// NivelElite.java
public class NivelElite implements NivelComportamiento {
    @Override
    public int calcularDano(int danoBase) { return (int)(danoBase * 1.5f); }
    @Override
    public int calcularSalud(int saludBase) { return (int)(saludBase * 1.3f); }
    @Override
    public String obtenerRango() { return "Elite"; }
}