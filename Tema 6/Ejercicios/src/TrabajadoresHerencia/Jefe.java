package TrabajadoresHerencia;

public final class Jefe extends Trabajador{
    //variables
    private int acciones;
    private int beneficio;

    //constructores
    public Jefe(){}

    public Jefe(String nombre, String dni, String apellido, int acciones, int beneficio) {
        super(nombre, dni, apellido);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    //metodos
    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.print("    acciones: " + acciones + "    beneficio: " + beneficio);
    }

    public void despedir(){

    }


    //getter y setter
}
