public final class Jugador extends Persona{
    //variables
    private String posicion;

    //constructores
    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String dni, int edad, int sueldo, String posicion, int sueldo1) {
        super(nombre, apellido, dni, edad, sueldo);
        this.posicion = posicion;
    }

    //metodos
    @Override
    public void calcularSueldo() {
        sueldo += (sueldo*0.5);
    }

    //getter y setter
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
