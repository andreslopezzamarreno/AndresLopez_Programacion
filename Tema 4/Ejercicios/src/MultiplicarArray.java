import java.util.Scanner;

public class MultiplicarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[5];
        int suma = 0;
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *=2;
            System.out.println(numeros[i]);
            suma += numeros[i];
            media = (double) suma/(double)numeros.length;
        }
        System.out.println("La suma de todos los numeros es " + suma);
        System.out.println("La media de todos los numeros es " + media);
    }
}
