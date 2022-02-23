package TrabajadoresHerencia;

public abstract class Trabajador {
    //variables
    protected String nombre;
    protected String dni;
    protected String apellido;

    //constructores
    public Trabajador(){}

    public Trabajador(String nombre, String dni, String apellido){
        this.nombre = nombre;
        this.dni= dni;
        this.apellido = apellido;
    }

    //metodos
    public void mostrardatos(){
        System.out.print("nombre: " + nombre + "    Apellido: " + apellido + "    Dni: " + dni);
    }

    //getter y setter
}
