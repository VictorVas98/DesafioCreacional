public class FabricaEnemigoJefe extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        // Aquí, estamos creando una instancia de EnemigoJefe.
        // Puedes personalizar la creación según tus necesidades.
        return new EnemigoJefe();
    }
}