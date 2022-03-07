public abstract class Trabajador extends Persona{

    protected int sueldo;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }


}
