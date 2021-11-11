import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla = 0;
        int numero;
        System.out.println("Tabla del:");
        numero = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + tabla + " = " + (numero * tabla));
            tabla++;
        }
    }
}
