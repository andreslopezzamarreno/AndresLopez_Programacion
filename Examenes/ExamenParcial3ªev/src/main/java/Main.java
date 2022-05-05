import controller.Ejercicio1Controller;
import controller.Ejercicio2Controller;
import controller.Ejercicio3Controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        //Ejercicio 1
        Ejercicio1Controller ejercicio1 = new Ejercicio1Controller();
        ejercicio1.leerFichero();

        //Ejercicio 2
        Ejercicio2Controller ejercicio2 = new Ejercicio2Controller();
        ejercicio2.mostrarCaracteristicas();
*/
        //Ejercicio 3
        int opcion;
        Ejercicio3Controller ejercicio3 = new Ejercicio3Controller();
        System.out.println("Que quieres hacer\n1.Ver peliculas Cartelera\n2.Ver películas próximamente");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio3.ejercicio("https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1");
                break;
            case 2:
                ejercicio3.ejercicio("https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1");
                break;
        }
    }
}
