public final class Audio extends Elemento implements Ejecutable {

    private String soporte;
    private int duracion;

    public Audio() {}
    public Audio(int id, int tamanio, String titulo, String autor, String formato, String soporte, int duracion) {
        super(id, tamanio, titulo, autor, formato);
        this.soporte = soporte;
        this.duracion = duracion;
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
