public class SistemaEconomia {

    public void cobrar(Jugador jugador, int costo) throws OroInsuficienteException {
        if (jugador.getOro() < costo) {
            throw new OroInsuficienteException(
                    "Faltan " + (costo - jugador.getOro()) + " monedas de oro."
            );
        }
        jugador.descontarOro(costo);
        System.out.println("[-] Se han cobrado " + costo + " monedas de oro.");
    }
}