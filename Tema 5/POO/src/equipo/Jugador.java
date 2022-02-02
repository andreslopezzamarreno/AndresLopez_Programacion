package equipo;

public class Jugador {
    //variables
    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;

    //contructor
    public Jugador(String nombre, String posicion, int calidad){
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        if (calidad >=90){
            this.estrella = true;
        }
    }

    //metodos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre+"\nPosicion: "+ posicion + "\nCalidad: " + calidad +
                "\nEstrella: " + estrella);
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }
}
