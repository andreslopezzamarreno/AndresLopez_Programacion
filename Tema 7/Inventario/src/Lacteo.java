public final class Lacteo extends Alimento {

    private int volumen;

    public Lacteo(String calidad, String origen, double precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    public Lacteo() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Volumen: " + volumen);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
