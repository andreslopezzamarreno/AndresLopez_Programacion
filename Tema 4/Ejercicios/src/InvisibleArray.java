import java.util.ArrayList;
import java.util.Scanner;

public class InvisibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] personas;
        int numPers;
        int aleat;
        int aleat2;
        ArrayList<Integer> pers = new ArrayList<>();


        do {
            System.out.println("Cuantas personas van a participar?(tiene que ser par)");
            numPers = sc.nextInt();
        } while (numPers % 2 != 0);
        personas = new String[numPers];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introducir nombre del participante numero " + (i + 1));
            personas[i] = sc.next();
        }

        for (int i = 0; i < personas.length / 2; i++) {
            aleat = (int) (Math.random() * numPers);
            aleat2 = (int) (Math.random() * numPers);

            do{
                if (pers.contains(aleat)){
                    aleat = (int) (Math.random() * numPers);
                }else{
                    pers.add(aleat);
                }
            }while (!pers.contains(aleat) );


            do{
                if(pers.contains(aleat2)){
                    aleat2 = (int) (Math.random() * numPers);
                }else{
                    pers.add(aleat2);
                }
            }while(!pers.contains(aleat2));


            System.out.println(personas[aleat] + " - " + personas[aleat2]);
        }
    }
}
