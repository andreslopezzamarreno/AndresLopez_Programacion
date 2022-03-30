import java.util.ArrayList;

public class Carrera{

    private ArrayList<Vehiculo> vehiculos;
    private Vehiculo ganador;
    private int aleatorio;

    public Carrera() {
        vehiculos = new ArrayList<>();
    }

    public void validar(Vehiculo vehiculo,Validacion validacion){
        if(validacion.validar(vehiculo)){
            vehiculos.add(vehiculo);
        }
    }

    public void generarGanador(){
        aleatorio = (int)(Math.random()*vehiculos.size());
        System.out.println(aleatorio);
        ganador = vehiculos.get(aleatorio);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Vehiculo getGanador() {
        return ganador;
    }

    public void setGanador(Vehiculo ganador) {
        this.ganador = ganador;
    }

    public int getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }
}