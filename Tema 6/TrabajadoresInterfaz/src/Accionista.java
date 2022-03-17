public final class Accionista extends Persona implements Comision{

    private int porcentajeAcciones;

    public Accionista() {}

    public Accionista(String nombre, String apellido, String dni, int porcentajeAcciones) {
        super(nombre, apellido, dni);
        this.porcentajeAcciones = porcentajeAcciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("% Acciones: " + porcentajeAcciones);
    }

    @Override
    public double votar() {
        double voto = Math.random()*11;
        return voto;
    }

    @Override
    public void obtenerBeneficio() {

    }
    public int getPorcentajeAcciones() {
        return porcentajeAcciones;
    }

    public void setPorcentajeAcciones(int porcentajeAcciones) {
        this.porcentajeAcciones = porcentajeAcciones;
    }


}
