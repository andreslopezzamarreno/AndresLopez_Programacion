import java.util.ArrayList;

public final class Socio extends Persona{
    //variables
    private int numSocio;
    private ArrayList listaPrestamos;

    //constructores

    public Socio(String nombre, String apellido, String dni){
        super(nombre, apellido, dni);
        this.listaPrestamos = new ArrayList();
        this.numSocio = listaPrestamos.size() +1;
    }

    public Socio() {}

    //metodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de socio: " + numSocio);
        for (Object item: listaPrestamos) {

        }
    }

    //getter y setter
    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public ArrayList getPrestamos() {
        return listaPrestamos;
    }

}
