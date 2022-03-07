public class Canterano extends Persona implements Seleccionable{

    private int posibilidades;

    public Canterano(String nombre, String apellido, double sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 100;
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
