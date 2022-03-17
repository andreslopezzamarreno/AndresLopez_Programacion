public final class Jefe extends Trabajador implements Comision{

    private int numTrabajadores;


    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numTrabajadores = numTrabajadores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de trabajadores: " + numTrabajadores);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11) /3;
        return voto;
    }

    @Override
    public void obtenerBeneficio() {

    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }


}
