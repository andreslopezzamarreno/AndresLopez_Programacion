import java.util.ArrayList;

public final class Seleccion {
    //variables
    private String nombre;
    private ArrayList<Persona> listaPersonas ;
    private double gastos;

    private int numJugadores, numEntrenadores;

    //constructores
    public Seleccion(String nombre){
        this.nombre = nombre;
        listaPersonas = new ArrayList<>();
        this.gastos = 0;
    }

    //metodos
    private Persona existePersona(Persona persona){
        Persona persona1 = null;
        for (Persona item: listaPersonas) {
            if(persona.dni.equalsIgnoreCase(item.dni)){
                persona1 = item;
                break;
            }
        }
        return persona1;
    }

    public void contratarEntrenador(Entrenador entrenador){
       if(existePersona(entrenador) == null){
           listaPersonas.add(entrenador);
           gastos += entrenador.sueldo;
       }else{
           System.out.println("El entrenador ya existe");
       }
    }

    public void contratarJugador(Jugador jugador){
        if(existePersona(jugador) == null){
            listaPersonas.add(jugador);
            gastos += jugador.sueldo;
        }else{
            System.out.println("El jugador ya existe");
        }
    }
    public void verPosicion(String posicion){
        for (Persona item: listaPersonas) {
            if (item instanceof Jugador){
                if (((Jugador) item).getPosicion().equalsIgnoreCase(posicion)){
                    item.mostrarDatos();
                }
            }
        }
    }

    public void verJugadores(){
        for (Persona item:listaPersonas) {
            if (item instanceof Jugador){
                item.mostrarDatos();
            }
        }
    }

    public void verEntrenadores(){
        for (Persona item:listaPersonas) {
            if (item instanceof Entrenador){
                item.mostrarDatos();
            }
        }
    }

    public void verPlantilla(){
        System.out.println("La plantilla es: ");
        for (Persona item: listaPersonas) {
            if(item instanceof Jugador){
                item.mostrarDatos();
                numJugadores ++;
            }else{
                item.mostrarDatos();
                numEntrenadores ++;
            }
        }
        System.out.println("En la seleccion hay " + numEntrenadores + " entrenadores y "+ numJugadores + " jugadores");
    }

    public void mostrarGastos(){
        System.out.println("El gasto total de la seleccion de " + nombre + " es de " + gastos + " €");
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getNumEntrenadores() {
        return numEntrenadores;
    }

    public void setNumEntrenadores(int numEntrenadores) {
        this.numEntrenadores = numEntrenadores;
    }
}
