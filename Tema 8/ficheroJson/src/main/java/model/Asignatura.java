package model;

import java.util.Arrays;

public class Asignatura {

    private String siglas,nombre,ciclo;
    private Profesor profesor;
    private int hora,curso;
    private String[] conocimientos;


    public Asignatura(String siglas, String nombre, String ciclo, int hora, int curso, String[] conocimientos, Profesor profesor) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.hora = hora;
        this.curso = curso;
        this.conocimientos = conocimientos;
        this.profesor = profesor;
    }

    public Asignatura() {
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String[] getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String[] conocimientos) {
        this.conocimientos = conocimientos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "siglas='" + siglas + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", profesor=" + profesor +
                ", hora=" + hora +
                ", curso=" + curso +
                ", conocimientos=" + Arrays.toString(conocimientos) +
                '}';
    }
}
