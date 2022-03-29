public abstract class Mueble implements Inventariable {

    protected String material;
    protected double peso;
    protected double precio;

    public Mueble(String material, double peso, double precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public Mueble() {
    }

    public void mostrarDatos() {
        System.out.println("Material: " + material);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(precio + (precio * Inventariable.IVA_MUEBLES));
        System.out.println("El precio con IVA es: " + precio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
