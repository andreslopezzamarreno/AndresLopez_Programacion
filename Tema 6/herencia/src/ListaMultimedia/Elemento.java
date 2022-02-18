package ListaMultimedia;

public abstract class Elemento {

    //variables
    protected String id,titulo, autor, tamannio, formato;

    //constructores

    public Elemento(){}

    public Elemento(String id, String titulo, String autor, String tamannio, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamannio = tamannio;
        this.formato = formato;
    }

    //metodos
    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tamaño: " + tamannio);
        System.out.println("Formato: " + formato);
    }

    //getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTamannio() {
        return tamannio;
    }

    public void setTamannio(String tamannio) {
        this.tamannio = tamannio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
