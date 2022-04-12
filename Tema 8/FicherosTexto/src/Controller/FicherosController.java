package Controller;

import java.io.*;
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

    public void lecturaFichero(File file){

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int lectura = 0;
            while ((lectura =fileReader.read()) != -1){
                System.out.println((char)lectura);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

    }

    public void lecturaBuffer(File file){

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String todo ="";
            String lectura = null;
            while((lectura = bufferedReader.readLine()) != null){
                todo += lectura + "\n";
            }
            System.out.println(todo);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void escrituraFichero(File file){
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("klk manin");
        }catch (IOException e){

        }
    }

}
