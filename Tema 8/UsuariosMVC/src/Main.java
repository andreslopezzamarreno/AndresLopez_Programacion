import controller.UsuarioController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioController usuarioController = new UsuarioController();
        int opcion;

        usuarioController.introducirDatos();

        System.out.println("quieres leer el fichero\n1-si\n0-no");
        opcion = sc.nextInt();
        if(opcion == 1){
            usuarioController.escribirFichero();
        }
    }
}
