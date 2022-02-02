package cajeroBase;

public class Cliente {
    //variables
    private String dni;
    private String nombre;
    private int telefono;

    //constructor
    public Cliente(){
    }

    public Cliente(String nombre, String dni, int telefono){
        this.nombre= nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //metodos
    public void mostrarDatos(){

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
