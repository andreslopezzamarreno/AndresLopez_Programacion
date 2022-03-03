public abstract class Persona {
    //variables
    protected String nombre, apellido, dni;
    protected int edad;
    protected double sueldo;

    //constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        calcularSueldo();
    }

    //metodos
    public abstract void calcularSueldo();

    public void mostrarDatos() {
        System.out.println("nombre: " + nombre + "\napellido: " + apellido + "\ndni: " + dni + "\nedad: " + edad + "\nsueldo: " + sueldo);
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
