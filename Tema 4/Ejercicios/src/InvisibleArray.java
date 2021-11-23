
import java.util.Arrays;
import java.util.Scanner;

public class InvisibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] personas;
        int[] pers;
        int numPers;
        int aleat;
        int aleat2;


        do {
            System.out.println("Cuantas personas van a participar?(tiene que ser par)");
            numPers = sc.nextInt();
        } while (numPers % 2 != 0);
        personas = new String[numPers];
        pers = new int[numPers];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introducir nombre del participante numero " + (i + 1));
            personas[i] = sc.next();
            pers[i] = i;
            System.out.println(pers[i]);
        }

        for (int i = 0; i < personas.length / 2; i++) {
            aleat = (int) (Math.random() * numPers);
            aleat2 = (int) (Math.random() * numPers);
            boolean contenido = Arrays.asList(pers).contains(2);
            System.out.println(contenido);

            System.out.println(personas[aleat] + " - " + personas[aleat2]);
        }
    }
}
