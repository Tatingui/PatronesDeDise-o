// NivelBasico.java
public class NivelBasico implements NivelComportamiento {
    @Override
    public int calcularDano(int danoBase) {
        return danoBase;
    }

    @Override
    public int calcularSalud(int saludBase) {
        return saludBase;
    }

    @Override
    public String obtenerRango() {
        return "Basico";
    }
}