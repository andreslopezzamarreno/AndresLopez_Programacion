import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        JSONController controller = new JSONController();

        int numUsers;
        String gender;

        System.out.println("Cuantos usuarios quieres obtener");
        numUsers = sc.nextInt();

        System.out.println("Genero de los usuarios (male/female/both)");
        gender = sc.next();

        controller.buscarUsuario(numUsers,gender);


    }
}
