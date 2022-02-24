public final class Entrenador extends Persona{
    //variables
    private String vocacion;

    //constructores

    public Entrenador() { }

    public Entrenador(String nombre, String apellido, String dni, int edad, int sueldo, String vocacion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.vocacion = vocacion;
    }

    //metodos
    @Override
    public void calcularSueldo() {
        sueldo += (sueldo*0.25);
    }

    //getter y setter
    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}
