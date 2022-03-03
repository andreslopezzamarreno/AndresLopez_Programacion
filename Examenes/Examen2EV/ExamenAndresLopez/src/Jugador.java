public final class Jugador extends Persona {
    //variables
    private String posicion;

    //constructores
    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String dni, int edad, double sueldo, String posicion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.posicion = posicion;
    }

    //metodos
    @Override
    public void calcularSueldo() {
        sueldo += (sueldo * 0.5);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("posicion: " + posicion);
    }

    //getter y setter
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
