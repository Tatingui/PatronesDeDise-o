public class Television implements  Dispositivo{

    private boolean prendida;
    private int volumen;
    private int canal;

    public Television(){
        prendida = false;
        volumen = 30;
        canal = 10;
    }

    @Override
    public boolean estaPrendida() {
        return prendida;
    }

    @Override
    public void prender() {
        prendida = true;
    }

    @Override
    public void apagar() {
        prendida = false;
    }

    @Override
    public int obtenerVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int volumen) {
        if(volumen > 100){
            this.volumen = 100;
        }
        else{
            this.volumen = Math.max(volumen, 0);
        }
    }

    @Override
    public int obtenerCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = Math.max(canal, 1);
    }

    @Override
    public void mostrarEstado() {
        System.out.println("// Soy una TV //");
        System.out.println("Estoy " + (prendida ? "prendida" : "apagada"));
        if(prendida) {
            System.out.println("Mi volumen actual es " + volumen);
            System.out.println("Estoy en el canal " + canal);
        }
    }
}
