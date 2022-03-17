import javax.swing.plaf.ComponentUI;
import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> listaPersona = new ArrayList<>();
    private String nombre;
    private int votos;
    private int beneficios;

    public Empresa(String nombre, int beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
        listaPersona = new ArrayList<>();
    }

    public void listarPersonas(){
        for (Persona item:listaPersona) {
            item.mostrarDatos();
        }
    }

    public void addPersona(Persona persona){
        //meter restriccion de que no se repitan DNI
        listaPersona.add(persona);
    }

    public void despedirPersona(String dni){
        for (int i = 0; i < listaPersona.size(); i++) {
            if (listaPersona.get(i).getDni().equalsIgnoreCase(dni)){
                listaPersona.remove(i);
                break;
            }
        }
    }

    public void buscarPersoona(String dni){
        for (Persona item: listaPersona) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.mostrarDatos();
            }
        }
    }

    public void registrarVotacion(Comision comision){
        this.votos += comision.votar();
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}



