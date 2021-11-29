import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        final double CAFE = 1;
        final double REFRESCO = 1.20;
        final double BOCADILLO = 3.20;
        final double MENU = 9.50;
        int numCafe;
        int totalCafe = 0;
        int numRefresco;
        int totalRefresco = 0;
        int numBocadillo;
        int totalBocadillo = 0;
        int numMenu;
        int totalMenu = 0;
        int comensales;
        double total;


        do {
            System.out.println("1.Pedir café \n2.Pedir refresco \n3.Pedir bocadillo \n4.Pedir menú\n5.Sacar la cuenta\nIntroduce una opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Numero de cafes");
                    numCafe = sc.nextInt();
                    if (numCafe > 0) {
                        System.out.println(numCafe + " cafes añadidos a la cuenta ");
                        totalCafe += numCafe;
                    } else {
                        System.out.println("Error. Opcion no valida");
                    }
                    break;

                case 2:
                    System.out.println("Numero de refrescos");
                    numRefresco = sc.nextInt();
                    if (numRefresco > 0) {
                        System.out.println(numRefresco + " refrescos añadidos a la cuenta");
                        totalRefresco += numRefresco;
                    } else {
                        System.out.println("Error. Opcion no valida");
                    }
                    break;

                case 3:
                    System.out.println("Numero de bocadillos");
                    numBocadillo = sc.nextInt();
                    if (numBocadillo > 0) {
                        System.out.println(numBocadillo + " bocadillos añadidos a la cuenta");
                        totalBocadillo += numBocadillo;
                    } else {
                        System.out.println("Error. Opcion no valida");
                    }
                    break;

                case 4:
                    System.out.println("Numero de menu");
                    numMenu = sc.nextInt();
                    if (numMenu > 0) {
                        System.out.println(numMenu + " menus añadidos a la cuenta");
                        totalMenu += numMenu;
                    } else {
                        System.out.println("Error. Opcion no valida");
                    }
                    break;

                case 5:
                    total = totalBocadillo * BOCADILLO + totalRefresco * REFRESCO + totalMenu * MENU + totalCafe * CAFE;
                    if (total == 0) {
                        System.out.println("No se ha consumido nada. Adios");
                    } else {
                        do {
                            System.out.println("Numero de comensales");
                            comensales = sc.nextInt();
                            if (comensales > 0) {
                                System.out.println("Bocadillos: " + totalBocadillo);
                                System.out.println("Refrescos: " + totalRefresco);
                                System.out.println("Menús: " + totalMenu);
                                System.out.println("Cafés: " + totalCafe);
                                System.out.println("Precio total: " + total + " €");
                                System.out.printf("Precio por persona: %.2f €", (total / comensales));
                            } else {
                                System.out.println("Error. Opcion no valida");
                            }
                        } while (comensales <= 0);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida. Prueba otra vez");
            }
        } while (opcion != 5);
    }
}
