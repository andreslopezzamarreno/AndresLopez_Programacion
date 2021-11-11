import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion;
        int numero1;
        int numero2;

        do {
            System.out.println("Que quieres hacer?\n 1.Calcular primos\n 2.Calcular factorial\n 3.Calcular inverso\n" +
                    " 4.Calcular suma\n 0. Salir");
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 0:
                    System.out.println("SALIR");
                    break;
                case 1:
                    System.out.println("Vas a calcular los primos");
                    break;
                case 2:
                    System.out.println("Vas a calcular el factorial");
                    break;
                case 3:
                    System.out.println("Vas a calcular el inverso");
                    System.out.println("Numero que quieres calcular el inverso");
                    numero1 = sc.nextInt();
                    if (numero1 >= 0) {
                        float inversa = 1 / (float) numero1;
                        System.out.println("El inverso de " + numero1 + " es " + inversa);
                    } else {
                        System.out.println("la suma no es posible, alguno de los dos numeros es negativo");
                    }

                    break;
                case 4:
                    System.out.println("Vas a calcular la suma ");
                    System.out.println("Introduce primer operando");
                    numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo operando ");
                    numero2 = sc.nextInt();
                    if (numero1 >= 0 && numero2 >= 0) {
                        System.out.println("El resultado es " + (numero1 + numero2));
                    } else {
                        System.out.println("la suma no es posible, alguno de los dos numeros es negativo");
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (eleccion != 0 && eleccion<0 && eleccion>5);
        if (eleccion >0 && eleccion<5){
            System.out.println("Fin del programa");
        }
        sc.close();
    }
}
