public class CreadorDuende implements CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Duende();
    }
}
