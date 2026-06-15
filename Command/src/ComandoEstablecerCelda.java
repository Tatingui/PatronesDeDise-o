public class ComandoEstablecerCelda implements Comando {

    private final TableroDeJuego receptor;
    private final TipoCelda tipoNuevo;
    private TipoCelda tipoAnterior; //Para el UNDO
    private final int x, y;

    public ComandoEstablecerCelda(TableroDeJuego receptor, TipoCelda tipoNuevo, int x, int y) {
        this.receptor = receptor;
        this.tipoNuevo = tipoNuevo;
        this.x = x;
        this.y = y;
    }

    @Override
    public void ejecutar() {
        System.out.println("[COMANDO] Ejecutando: Establecer (" + x + ", " + y + ") a " + tipoNuevo.name());
        this.tipoAnterior = receptor.obtenerTipoCelda(x, y);
        receptor.establecerTipoCelda(tipoNuevo, x, y);
    }

    @Override
    public void desHacer() {
        System.out.println("[COMANDO] Deshaciendo: Restaurando (" + x + ", " + y + ") a " + tipoAnterior.name());
        receptor.establecerTipoCelda(tipoAnterior, x, y);
    }
}
