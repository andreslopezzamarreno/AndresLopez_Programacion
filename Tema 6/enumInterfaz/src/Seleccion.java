import java.util.ArrayList;

public class Seleccion {

    private ArrayList<Persona>listaPersonas;

    public Seleccion(){
        this.listaPersonas = new ArrayList<>();
    }

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public void comprobarAtaque(){
        for (Persona persona: listaPersonas){

        }
    }
}