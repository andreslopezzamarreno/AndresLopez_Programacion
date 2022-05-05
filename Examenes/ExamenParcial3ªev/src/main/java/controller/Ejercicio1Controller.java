package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1Controller {

    public void leerFichero() {
        File file = new File("src/main/resources/fichero_cifrado.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo;
            while ((codigo = fileReader.read()) != -1) {
                codigo = codigo / 2;
                System.out.print((char) codigo);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

