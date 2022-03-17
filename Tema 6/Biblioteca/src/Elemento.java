public class Elemento {

    //variables
    protected int id,seccion;
    protected String titulo;
    protected boolean estado;

    public Elemento(int id, int seccion, String titulo, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = estado;
    }

    public Elemento() {
    }

    public void mostrarDatos(){
        System.out.println(titulo);
        System.out.println(estado);
        System.out.println(id);
        System.out.println(seccion);
    }
}
