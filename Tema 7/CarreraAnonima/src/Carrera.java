import java.util.ArrayList;

public class Carrera {

    private ArrayList<Vehiculo> vehiculos;
    private Vehiculo ganador;
    private int aleatorio;

    public Carrera() {
        vehiculos = new ArrayList<>();
    }

    public void validarVehiculo(Vehiculo vehiculo, Validacion validacion){

    }

    public void generarGanador(){
        aleatorio = (int)(Math.random()*vehiculos.size());
        ganador = vehiculos.get(aleatorio);
    }
}