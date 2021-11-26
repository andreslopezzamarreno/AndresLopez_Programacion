

//  sin terminar


import java.util.Scanner;

public class AhorcadoArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String [] palabras = new String[20];
        int aleat =(int) (Math.random()*21);
        char letra;
        final int vidas = 5;
        System.out.println(aleat);

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("introduce palabra en la posicion " + i);
            palabras[i] = sc.next();
        }
        String[] letras = new String[palabras[aleat-1].length()];
        for (int i = 0; i < palabras[aleat-1].length(); i++) {
            System.out.print("_ ");
        }
        System.out.println("Prueba con una letra");
        letra = sc.next().charAt(0);
    }
}
