public class Celda {

    private TipoCelda tipo;

    public Celda(TipoCelda tipoInicial) {
        this.tipo = tipoInicial;
    }

    public TipoCelda getTipo() {
        return tipo;
    }

    public void setTipo(TipoCelda tipo) {
        this.tipo = tipo;
    }
}
