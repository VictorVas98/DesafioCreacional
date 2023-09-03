public class Jugador implements Personaje {
    private String nombre;
    private int vida;

    public Jugador(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está atacando a un enemigo.");
    }

    @Override
    public void recibirDaño(int cantidad) {
            vida -= cantidad;
            if (vida <= 0) {
                System.out.println(nombre + " ha perdido.");
            } else {
                System.out.println(nombre + " recibiste " + cantidad + " puntos de daño.");
            }
    }
}
