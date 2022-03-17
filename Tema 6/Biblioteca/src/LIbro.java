public class LIbro extends Elemento{

    //variables
    private int isbn, paginas;
    private String autor, editorial;

    public LIbro(int id, int seccion, String titulo, int isbn, int paginas, String autor, String editorial) {
        super(id, seccion, titulo);
        this.isbn = isbn;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public LIbro() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(isbn);
        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(paginas);
    }
}
