package controller;

import model.Personaje;

import java.io.*;

public class Ejercicio2Controller{

    public void mostrarCaracteristicas(){
        File file = new File("src/main/resources/personajes_vf.bin");

        ObjectInputStream ois = null;
        Personaje personaje;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            try {
                while ((personaje = (Personaje) ois.readObject()) != null) {
                    System.out.println(personaje.getName());
                    System.out.println(personaje.getPhoto());
                }
            } catch (EOFException e) {
                e.printStackTrace();
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
