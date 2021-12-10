import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> palabras = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la palabra " + (1+i));
            palabras.add(sc.next());
        }

        System.out.println(palabras);
    }
}
