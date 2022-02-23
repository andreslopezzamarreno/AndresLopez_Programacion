package TrabajadoresHerencia;

public final class Autonomo extends Trabajador{
    //varibles
    private int sueldo;
    private boolean contrato;

    //constructores
    public Autonomo() {}

    public Autonomo(String nombre, String dni, String apellido, int sueldo, boolean contrato) {
        super(nombre, dni, apellido);
        this.sueldo = sueldo;
        this.contrato = contrato;
    }

    //metodos
    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("    salario anual: " + sueldo *12);
    }

    //getter y setter
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}