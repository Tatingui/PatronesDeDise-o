public class ControlRemotoBasico implements ControlRemoto{

    protected Dispositivo dispositivoControlable; //No es final

    public ControlRemotoBasico(Dispositivo dispositivo){
        dispositivoControlable = dispositivo;
    }

    @Override
    public void power() {
        if(dispositivoControlable.estaPrendida()){
            dispositivoControlable.apagar();
        }else {
            dispositivoControlable.prender();
        }
    }

    @Override
    public void subirVolumen() {
        dispositivoControlable.setVolumen(dispositivoControlable.obtenerVolumen() + 1);
    }

    @Override
    public void bajarVolumen() {
        dispositivoControlable.setVolumen(dispositivoControlable.obtenerVolumen() - 1);
    }

    @Override
    public void subirCanal() {
        dispositivoControlable.setCanal(dispositivoControlable.obtenerCanal() + 1);
    }

    @Override
    public void bajarCanal() {
        dispositivoControlable.setCanal(dispositivoControlable.obtenerCanal() - 1);
    }
}
