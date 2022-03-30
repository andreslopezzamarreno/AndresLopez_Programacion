package Anonimas;

public class ClaseB extends ClaseA{
    @Override
    public void mostrarMensaje() {
        System.out.println("Mensaje sobreescrito desde la clase B");    }

    @Override
    public void mensajeAbastracto() {
        System.out.println("Mensaje lanzado desde la clase B");
    }
}
