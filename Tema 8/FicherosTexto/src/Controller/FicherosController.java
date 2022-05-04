package Controller;

import java.io.*;
import java.util.Scanner;

public class FicherosController {
    Scanner sc = new Scanner(System.in);

    public void getFileInfo(File file) {
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero? " + file.isFile());
        System.out.println("Existe? " + file.exists());
        System.out.println("Padre: " + file.getParent());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getDirectoryInfo(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()) {
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero : ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(nombreFicheros);
            /*for (String nombre: nombreFicheros) {
                System.out.println(nombre);
            }*/
        }
    }

    public void lecturaFichero(File file) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int lectura = 0;
            while ((lectura = fileReader.read()) != -1) {
                System.out.println((char) lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void lecturaBuffer(File file) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String todo = "";
            String lectura;
            while ((lectura = bufferedReader.readLine()) != null) {
                todo += lectura + "\n";
            }
            System.out.println(todo);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escrituraFichero(File file) {
        FileWriter fileWriter = null;
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dentro del fichero";

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(lineaEscribir);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirFicheroCompleto(File file) {

        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println("Esto es un ejemplo de linea");
            printWriter.println("Esto es un ejemplo de linea segunda");
            printWriter.println("Esto es un ejemplo de linea tercera");
            /*bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Esto es un ejemplo");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo de linea nueva");
            bufferedWriter.newLine();*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                /*if (bufferedWriter != null) {
                    //fileWriter.close();
                    bufferedWriter.close();
                }*/
            if (printWriter != null) {
                //fileWriter.close();
                printWriter.close();
            }
        }
    }
}
