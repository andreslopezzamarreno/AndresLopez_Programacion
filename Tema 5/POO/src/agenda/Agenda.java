package agenda;

import java.util.Hashtable;

public class Agenda {
    //variables
    private Hashtable<String, Persona> agenda = new Hashtable<>();

    //constructor
    public Agenda(){
    }

    //getter y setter
    public Hashtable<String, Persona> getAgenda() {
        return agenda;
    }
    public void setAgenda(Hashtable<String,Persona> agenda) {
        this.agenda = agenda;
    }
}
