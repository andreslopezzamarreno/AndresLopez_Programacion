package ListaMultimedia;

public final class Pelicula extends Elemento{

    //variables
    private String actores,director;

    //constructor
    public Pelicula(String id, String titulo, String autor, String tamannio, String formato, String actores, String director) {
        super(id, titulo, autor, tamannio, formato);
        this.actores = actores;
        this.director = director;
    }

    //metodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Actores: " + actores);
        System.out.println("Director: " + director);
    }

    //getter y setter
    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
