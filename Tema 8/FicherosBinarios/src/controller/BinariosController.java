package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario() {
        File file = new File("src/resources/objetos.bin");
        ObjectOutputStream oos = null;
        // hay que cerrar el ultimo de la cola, en este caso oos

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new Usuario("Andres","Lopez","1234A"));
            oos.writeObject(new Usuario("pedro","Herrera","1234B"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void lecturaBinario(){
        File file = new File("src/resources/objetos.bin");
        ObjectInputStream ois = null;
        Usuario usuario;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            try{
                while ((usuario = (Usuario) ois.readObject()) != null){
                    System.out.println(usuario);
                }
            }catch (EOFException e){
                System.out.println("Fichero terminado");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
