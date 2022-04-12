import Controller.EjercicioController;
import Controller.FicherosController;
import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;

        file = new File("C:/Users/asus/OneDrive/Escritorio/Ficheros/fichero.txt");
        directory = new File("C:/Users/asus/OneDrive/Escritorio/Ficheros");
        directory2 = new File("C:/Users/asus/OneDrive/Escritorio/Ficheros_Nuevo");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.lecturaFichero(file);
        ficherosController.escrituraFichero(file);




    }
}
