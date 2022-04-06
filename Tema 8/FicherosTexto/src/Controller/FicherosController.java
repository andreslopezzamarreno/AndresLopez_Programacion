package Controller;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicherosController {
    Scanner sc = new Scanner(System.in);

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? " +file.isDirectory());
        System.out.println("Es fichero? " +file.isFile());
        System.out.println("Existe? " +file.exists());
        System.out.println("Padre: " + file.getParent());

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void getDirectoryInfo(File file){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            //System.out.println(nombreFicheros);
            /*for (String nombre: nombreFicheros) {
                System.out.println(nombre);
            }*/
            for (File fichero :ficheros) {
                System.out.println(fichero.getName());
            }
        }



    }




}
