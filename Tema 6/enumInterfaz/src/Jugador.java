public final class Jugador extends Persona implements Seleccionable{

    private String posicion;
    public Jugador(String nombre, String apellido, double sueldo,String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void calcularSueldo() {
        //sueldo neto = sueldo bruto - retenciones (IRPF)
        this.sueldo -= (this.sueldo * Constantes.IRPF);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
