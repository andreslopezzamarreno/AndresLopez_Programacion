public class Usuarios {

    //variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;

    //constructores
    //si no hay constructores escritos hay un constructor que es el vacio (por defecto)
    //Este constructor deja de existir cuando se crea algun constructor

    public Usuarios(){
        this.nombre = "Por defecto";
        this.correoElectronico = "Por defecto";

    }

    public Usuarios(String correoElectronico,String nombre,String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;

    }
    public Usuarios(String correoElectronico,String password,int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }

    //metodos

    //metodos especiales (getters y setters)
    //getter de pass
    public String getPassword(){
        return password;
    }
    //setter de pass
    public void setPassword(String password){
        this.password = password;
    }

    //getter y setter de apellidos
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }

    //getter y setter de nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //getter y setter de apellidos
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    //getter y setter de fecha
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    //getter y setter de edad (otra forma)
    //escribir directamente set o get y el nombre de la variable

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
