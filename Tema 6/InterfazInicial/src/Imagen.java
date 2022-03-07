public final class Imagen extends Elemento implements Ejecutable {

    private String isbn;

    public Imagen() {}
    public Imagen(int id, int tamanio, String titulo, String autor, String formato, String isbn) {
        super(id, tamanio, titulo, autor, formato);
        this.isbn = isbn;
    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
