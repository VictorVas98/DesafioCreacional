public class EnemigoNormal implements Enemigo {
    private String nombre;
    private int vida;

    public EnemigoNormal(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.vida = puntosDeVida;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está atacando a un jugador.");
    }

    @Override
    public void recibirDaño(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println(nombre + " ha perdido.");
        } else {
            System.out.println(nombre + " recibio " + cantidad + " puntos de daño.");
        }
    }
}