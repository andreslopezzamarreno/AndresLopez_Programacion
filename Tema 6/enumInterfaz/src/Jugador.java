public final class Jugador extends Persona{

    public Jugador(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    public void calcularSueldo() {
        //sueldo neto = sueldo bruto - retenciones (IRPF)
        this.sueldo -= (this.sueldo * Constantes.IRPF);

    }

}
