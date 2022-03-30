package Anonimas;

public class ClaseC {

    public void registrarmensaje(ClaseA claseA){
        claseA.mostrarMensaje();
        claseA.mensajeAbastracto();
    }

    public void modificarMensaje(String s, Modicables modicables){
        modicables.lanzarMayusculas(s);
        modicables.lanzarMinusculas(s);
    }


}
