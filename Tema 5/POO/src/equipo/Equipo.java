package equipo;

import java.util.ArrayList;

public class Equipo {
    //variables
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa;
    private int goles;
    private ArrayList<Jugador> jugadores;

    //constructores
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 101);
        this.nivelCentro = (int) (Math.random() * 101);
        this.nivelDefensa = (int) (Math.random() * 101);
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    public Equipo (String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    //metodos
    public boolean atacar(){
        double attack =nivelAtaque*(Math.random())+nivelCentro +(Math.random())/2;
        if(attack>90){
            return true;
        }else{
            return false;
        }
    }

    public void añadirJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarDelanteros (){
        for (Jugador item: jugadores) {
            if (item.getPosicion().equalsIgnoreCase("delantero")){
                item.mostrarDatos();
            }
        }
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
