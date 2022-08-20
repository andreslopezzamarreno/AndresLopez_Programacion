public class Entrada {

    //varibles de clases
    String nombre = "Andres";
    int edad = 18;
    boolean carnet;

    //metodos
    public static void main(String[] args) {
        // System.out.println(nombre);
        new Entrada().saludar("Andres");
        //saludar("pepe");
        //saludar(nombre);
    }

    public void saludar(String nombreParam) {
        System.out.println("hola bienvenido al programa de repaso " + nombreParam);
        System.out.println(carnet);
        System.out.println(edad);
    }
}
