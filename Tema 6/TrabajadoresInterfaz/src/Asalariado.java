public final class Asalariado extends Trabajador{

    private int numPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numPagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numPagas = numPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pagas: " + numPagas);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Administracion.IRPF);
    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }
}
