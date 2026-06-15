import java.util.Random;

public class ControlRemotoAmplio extends ControlRemotoBasico{

    Random random;

    public ControlRemotoAmplio(Dispositivo dispositivo) {
        super(dispositivo);
        random = new Random();
    }

    public void mutear(){
        dispositivoControlable.setVolumen(0);
    }

    public void zapping(){
        dispositivoControlable.setCanal(random.nextInt(100) + 1);
    }
}
