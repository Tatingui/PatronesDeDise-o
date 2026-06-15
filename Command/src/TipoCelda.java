public enum TipoCelda {

    AGUA ('A'),
    TIERRA ('T'),
    ROCA ('R'),
    VACIA ('V');

    public final char simbolo;

    TipoCelda(char simbolo) {
        this.simbolo = simbolo;
    }
}
