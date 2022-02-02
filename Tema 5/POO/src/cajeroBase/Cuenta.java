package cajeroBase;

public class Cuenta {
    private int pin;
    private double saldo;
    private int isbn;
    private Cliente cliente1;

    public Cuenta(Cliente cliente, double saldo, int pin) {
        cliente1 = cliente;
        this.saldo = saldo;
        this.pin = pin;
    }

    //metodos
    public void ingresarDinero() {

    }

    public void sacarDinero() {

    }

    public void datosCuenta() {

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        cliente1 = cliente1;
    }
}
