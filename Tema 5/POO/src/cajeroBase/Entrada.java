package cajeroBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Introduce el banco con el que quieres operar\n1.BBVA\n2.Santander");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("---SELECCIONADO BBVA---");
                Banco bbva = new Banco("BBVA", "N4576779E");
                break;
            case 2:
                System.out.println("---SELECCIONADO SANTANDER---");
                Banco santander = new Banco("Santander","P2003016I");
                break;
        }
        System.out.println("1.Crear una cuenta\n2.Ingresar dinero\n3.Sacar dinero\n4.Ver cuentas de un cliente\n5.Ver todas las cuentas\n" +
                "Que quieres hacer:");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Cliente existente o nuevo cliente\n1.Existente\n2.Nuevo");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println();

                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }
}
