public class Juego {

    public static void main(String[] args) {

        Personaje miPersonaje = new Personaje(100, 1, new Coordenada(0, 0, 0));
        GestorDePartidas gestor = new GestorDePartidas(miPersonaje);
        miPersonaje.mostrarEstado();

        miPersonaje.recibirDano(10);
        gestor.guardarAccion("Recibir daño");
        miPersonaje.mostrarEstado();

        miPersonaje.moverse(50, 10, -3);
        gestor.guardarAccion("Entrar a mazmorra");
        miPersonaje.mostrarEstado();

        gestor.deshacer(); //Vuelve al estado de 'Recibir daño'
        miPersonaje.mostrarEstado();

        gestor.deshacer(); //Vuelve al estado de 'Inicio del juego'
        miPersonaje.mostrarEstado();

        gestor.rehacer(); //Rehace 'Recibir daño'
        miPersonaje.mostrarEstado();

        miPersonaje.subirNivel();
        gestor.guardarAccion("Subir nivel");
        miPersonaje.mostrarEstado();

        gestor.deshacer(); //Vuelve al estado de 'Recibir daño'
        miPersonaje.mostrarEstado();
    }
}
