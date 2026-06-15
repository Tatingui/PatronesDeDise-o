public class Juego {

    public static void main(String[] args) {

        String nombreArchivoLog = "logjuego.txt";

        SistemaLogAntiguo logAntiguo = new SistemaLogAntiguo(nombreArchivoLog);

        ILoggerEstructurado logger = new LogAdapterAntiguo(logAntiguo);

        LogroAlcanzado logro1 = new LogroAlcanzado(42, "Primer asesinato triple");
        logger.registrarLogro(logro1);

        LogroAlcanzado logro2 = new LogroAlcanzado(105, "Escape perfecto");
        logger.registrarLogro(logro2);
    }
}