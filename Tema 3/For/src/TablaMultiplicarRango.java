package ejsfor;


import java.util.Scanner;

public class TablaMultiplicarRango {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla = 0;
        int numero;
        int fin;

        System.out.println("Introduce rango: ");
        System.out.println("Inicio: ");
        numero = sc.nextInt();
        System.out.println("Final: ");
        fin = sc.nextInt();

        for (int i = numero; i < (fin + 1); i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println(numero + " X " + tabla + " = " + (numero * tabla));
                tabla++;
            }
            numero++;
            tabla = 0;
        }
    }

}
