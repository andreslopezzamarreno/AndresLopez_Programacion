package agenda;

public class Persona {

    //variables
    private String nombre;
    private int telefono;
    private String dni;

    //contructor
    public Persona (String nombre, int telefono, String dni){
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }

    //getter y setter
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
