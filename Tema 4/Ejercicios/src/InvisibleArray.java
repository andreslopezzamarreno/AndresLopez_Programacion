import java.util.Scanner;

public class InvisibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] personas;
        int numPers;
        int aleat;
        int aleat2;
        int []pers;

        do {
            System.out.println("Cuantas personas van a participar?(tiene que ser par)");
            numPers = sc.nextInt();
        } while (numPers % 2 != 0);
        personas = new String[numPers];
        pers = new int [numPers];

        for (int i = 0; i < pers.length; i++) {
            pers[i] = -1;
        }

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Introducir nombre del participante numero " + (i + 1));
            personas[i] = sc.next();
        }

        for (int i = 0; i < personas.length / 2; i++) {

            aleat = (int) (Math.random() * numPers);
            do{
                if (pers[aleat] == -1){
                    pers[aleat] = aleat;
                }else{
                    do{
                        aleat = (int) (Math.random() * numPers);
                    }while (pers[aleat] != -1);
                }
            }while (pers[aleat] == -1);

            aleat2 = (int) (Math.random() * numPers);
            do{
                if (pers[aleat2] == -1){
                    pers[aleat2] = aleat2;
                }else{
                    do{
                        aleat2 = (int) (Math.random() * numPers);
                    }while (pers[aleat2] != -1);
                }
            }while (pers[aleat2] == -1);


            System.out.println(personas[aleat] + " - " + personas[aleat2]);
        }
    }
}
