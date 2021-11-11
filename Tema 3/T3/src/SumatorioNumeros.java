import java.util.Scanner;

public class SumatorioNumeros {
    public static void main(String[] args) {

        int aleatorio = (int)(Math.random() *11);
        System.out.println(aleatorio);
        Scanner sc =new Scanner(System.in);

        int numero;
        int suma = 0;
        int repet = 0;
        float media = 0;
        int min = 999999999;
        int max = -999999999;

        System.out.println("Cuantos numeros quieres introducir?");
        repet = sc.nextInt();
        for (int i = 1; i <= repet;i ++){
            System.out.println("Introducir numero ");
            numero = sc.nextInt();
            suma += numero;
            if (numero<min){
                min=numero;
            }
            if (numero>max){
                max=numero;
            }
        }
        media = (float)suma/(float)repet;

        System.out.println("El resultado de todos los numeros es " + suma);
        System.out.printf("La media de todos los numeros es %.2f%n", media);
        System.out.println("El numero mas pequeño es " + min);
        System.out.println("El numero mas grande es " + max);
    }
}
