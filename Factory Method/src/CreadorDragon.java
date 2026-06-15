public class CreadorDragon implements CreadorEnemigo {
    @Override
    public Enemigo crearEnemigo() {
        return new Dragon();
    }
}