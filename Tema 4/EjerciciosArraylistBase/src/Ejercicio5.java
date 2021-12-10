import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList();
        int longitud=0;

        for (int i = 0; i < 10; i++) {
            palabras.add(sc.next());
        }
        for (int i = 0; i < palabras.size(); i++) {
            longitud += palabras.get(i).length();
        }
        System.out.println("La longitud es: " + longitud);
    }
}
