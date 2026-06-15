public class CreadorOrco implements CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Orco();
    }
}