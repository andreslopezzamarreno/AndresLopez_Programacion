package ListaMultimedia;

public final class Audio extends Elemento {

    //variables
    private int duracion;
    private String soporte;

    //constructores
    public Audio(int duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    //metodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion: " + duracion);
        System.out.println("Soporte: " + soporte);
    }

    //getter y setter
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
