public final class Silla extends Mueble {

    private int patas;

    public Silla(String material, double peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    public Silla() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Patas: " + patas);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
