import Controller.FicherosController;
import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("/Users/asus/OneDrive/Escritorio/Ficheros/ficheros/fichero.txt");
        File file2 = new File("/Users/asus/OneDrive/Escritorio/Ficheros/ficheros/ficheroEscritura.txt");
        File file3 = new File("/Users/asus/OneDrive/Escritorio/Ficheros/ficheros/ficheroEscrituraCompleto.txt");
        directory = new File("/Users/asus/OneDrive/Escritorio/Ficheros/ficheros");
        directory2 = new File("/Users/asus/OneDrive/Escritorio/Ficheros/ficheros_Nuevo");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.getFileInfo(file);
        //ficherosController.getDirectoryInfo(directory2);
        //ficherosController.lecturaFichero(file);
        //ficherosController.lecturaBuffer(file);
        //ficherosController.escrituraFichero(file2);
        ficherosController.escribirFicheroCompleto(file3);


    }
}
