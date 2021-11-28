

//  sin terminar


import java.util.Scanner;

public class AhorcadoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = {"ordenador", "cesped", "casa", "teclado", "leche", "tinta", "mensajero", "hora", "publicidad", "congelador"};
        int aleat = (int) (Math.random() * 11);
        String letra;
        int vidas = 5;
        String palabro = palabras[aleat - 1];
        int sumar = 0;
        int reps = 0;
        System.out.println(palabro.charAt(1));
        System.out.println(aleat);

        for (int i = 0; i < palabras[aleat - 1].length(); i++) {
            System.out.print("_ ");
        }

        do {
            System.out.println("\nPrueba con una letra");
            letra = sc.next();

            if (palabras[aleat - 1].contains(letra)) {
                do {
                    if (palabro.charAt(sumar) == letra.charAt(0)) {
                        System.out.print(letra + " ");

                    } else {
                        System.out.print("_ ");
                    }
                    sumar++;
                } while (sumar<palabro.length());
                sumar = 0;
            } else {
                vidas--;
                System.out.println("Una vida menos te quedan " + vidas);
            }

            reps++;
        } while (reps != palabro.length());
    }
}