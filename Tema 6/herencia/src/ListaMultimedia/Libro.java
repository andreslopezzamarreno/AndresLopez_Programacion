package ListaMultimedia;

public final class Libro extends Elemento {

    //variabels
    private int numeroPag, isbn;

    //constructores

    public Libro(String id, String titulo, String autor, String tamannio, String formato, int numeroPag, int isbn) {
        super(id, titulo, autor, tamannio, formato);
        this.numeroPag = numeroPag;
        this.isbn = isbn;
    }

    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de páginas: " + numeroPag);
    }
}
