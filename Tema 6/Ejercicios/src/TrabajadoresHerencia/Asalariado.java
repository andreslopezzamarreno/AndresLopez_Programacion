package TrabajadoresHerencia;

public final class Asalariado extends Trabajador{
    //variables
    private int sueldo;
    private int numPagas;
    private boolean contrato;

    //constructores
    public Asalariado() {}

    public Asalariado(String nombre, String dni, String apellido, int sueldo, int numPagas, boolean contrato) {
        super(nombre, dni, apellido);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contrato = contrato;
    }

    //metodos
    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("     salario anual: " + sueldo + "    salario mensual: " +  (sueldo + numPagas )
                + "    numero de pagas: "+ numPagas);
    }

    //getter y setter
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}
