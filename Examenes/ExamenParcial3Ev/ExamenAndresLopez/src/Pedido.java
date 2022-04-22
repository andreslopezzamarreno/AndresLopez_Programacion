public abstract class Pedido{
    /*antes tenia implementada la interfaz 'Constantes'
    a no ser que la interfaz tenga metodos no es necesario implementarla, simplemente se usa*/

    protected double precio;
    protected int numeroConsumiciones;

    //constructores
    public Pedido(double precio, int numeroConsumiciones) {
        this.precio = precio;
        this.numeroConsumiciones = numeroConsumiciones;

    }

    public Pedido() {
    }

    //metodos
    public abstract void calcularPrecioReal();

    public abstract void verFactura();

    //getter y setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroConsumiciones() {
        return numeroConsumiciones;
    }

    public void setNumeroConsumiciones(int numeroConsumiciones) {
        this.numeroConsumiciones = numeroConsumiciones;
    }
}
