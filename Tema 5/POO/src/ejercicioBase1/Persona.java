package ejercicioBase1;

public class Persona {

    //variables
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double peso;
    private int altura;

    //constructores
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
    }
    public Persona() {
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "111111111X";
    }


    //metodos
    public void mostrarDatos (){
        System.out.printf("Nombre: %s%nApellido: %s%nEdad: %d",nombre, apellido, edad);
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
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
