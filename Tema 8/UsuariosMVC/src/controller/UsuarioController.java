package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioController {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void introducirDatos() {

        File file = new File("src/resources/usuarios.txt");
        ObjectOutputStream outputStream = null;
        Usuario usuario;
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, password;
        int opcion;


        try {
            do {
                outputStream = new ObjectOutputStream(new FileOutputStream(file));
                System.out.println("Nombre");
                nombre = sc.next();
                System.out.println("Apellido");
                apellido = sc.next();
                System.out.println("Contraseña");
                password = sc.next();
                usuario = new Usuario(nombre, apellido, password);
                usuarios.add(usuario);
                System.out.println("Quieres seguir introduciendo datos\n1-si\n0-no");
                opcion = sc.nextInt();
            } while (opcion != 0);
            outputStream.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirFichero() {
        File file = new File("src/resources/usuarios.txt");
        ObjectInputStream ois = null;
        Usuario usuario;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            for (Usuario item : usuarios) {
                System.out.print("Nombre: " + item.getNombre());
                System.out.print(" //Apellido: " + item.getApellido());
            }
        } catch (IOException e) {
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
