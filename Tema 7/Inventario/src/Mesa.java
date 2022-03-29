public final class Mesa extends Mueble{

    private int capadidad;

    public Mesa(String material, double peso, double precio, int capadidad) {
        super(material, peso, precio);
        this.capadidad = capadidad;
    }

    public Mesa() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: " + capadidad);
    }

    public int getCapadidad() {
        return capadidad;
    }

    public void setCapadidad(int capadidad) {
        this.capadidad = capadidad;
    }
}
