package Controller;

import java.io.File;
import java.util.Scanner;

public class EjercicioController {

    Scanner sc = new Scanner(System.in);
    /*public void ejercicioListar(File file){

        int opcion;
        File[] ficheros = file.listFiles();
        do {
            int posicion = 1;
            System.out.println("Cual quieres listar?");
            for (File fichero : ficheros) {
                System.out.println(posicion + " "+ fichero.getName());
                posicion ++;
            }
            opcion = sc.nextInt();
            fichero2 = ficheros[opcion];
            for (File fichero : ficheros) {
                System.out.println(posicion + " "+ fichero2.getName());
                posicion ++;
            }
        }while (true);
    }*/


    public void listParentDirectory(){
        File file = new File("C:/Users/asus/OneDrive/Escritorio/Ficheros");
        File[] ficherosParent = file.listFiles();
        System.out.println("Imprimiendo " + file.getName());
        int contador=0;
        int opcion= 0;
        for (File item :ficherosParent) {
            System.out.println(contador + " - " + item.getName());
            contador ++;
        }

        System.out.println("Que directorio quieres listar");
        opcion = sc.nextInt();
        if (opcion >= 0 && opcion<ficherosParent.length) {
            if (ficherosParent[opcion].isDirectory()){
                listarChild(ficherosParent[opcion]);
            }else{
                System.out.println("Error es un ficheo");
            }
        }else{
            System.out.println("Opcion incorrecta");
        }
    }

    public void listarChild (File child){
        int contador= 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        for (File childItem: ficherosChild) {
            System.out.println(contador + " " + childItem.getName());
            contador++;
        }
        System.out.println("Que opcion quieres");
        opcion = sc.nextInt();
        if (opcion >= 0 && opcion<ficherosChild.length) {
            if (ficherosChild[opcion].isDirectory()){
                listarChild(ficherosChild[opcion]);
            }else {
                System.out.println("Error - es un fichero");
            }
        }else{
            System.out.println("Opcion incorrecta");
        }
    }
}
