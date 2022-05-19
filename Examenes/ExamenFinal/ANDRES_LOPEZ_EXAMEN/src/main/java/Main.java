import controller.EjercicioController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int total;
        String pais;
        EjercicioController ejercicioController = new EjercicioController();
        ejercicioController.ejercicio();

        System.out.println("Selecciona: \n1.Buscar por total\n2.Buscar por pais");
        opcion = sc.nextInt();

        if (opcion ==1){
            System.out.println("Introduce un total que quieres buscar");
            total = sc.nextInt();
            ejercicioController.invoiceFiltrada(total);
        }else if(opcion == 2){
            System.out.println("Por qué pais quieres buscar");
            pais = sc.next();
            ejercicioController.countryFintrada(pais);
        }else{
            System.out.println("Error al seleccionar");
        }
    }
}
