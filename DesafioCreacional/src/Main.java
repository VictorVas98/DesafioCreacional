public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Jugador 1", 100);
        jugador1.atacar();
        jugador1.recibirDaño(20);
        jugador1.recibirDaño(90);

        EnemigoNormal enemigo1 = new EnemigoNormal("Enemigo 1", 100);
        enemigo1.atacar();
        enemigo1.recibirDaño(20);
        enemigo1.recibirDaño(90);

        jugador1.atacar();
        enemigo1.atacar();
        jugador1.recibirDaño(20);
        enemigo1.recibirDaño(30);
    }
}
