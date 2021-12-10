import java.util.Scanner;

public class AhorcadoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = {"ordenador", "cesped", "casa", "teclado", "leche", "tinta", "mensajero", "hora", "publicidad", "congelador"};
        int aleat = (int) (Math.random() * 10);
        String letra;
        int vidas = 5;
        String palabro = palabras[aleat];
        String[] palabrita = new String[palabro.length()];
        int sumar = 0;
        int fin = 0;
        boolean salir = true;
        System.out.println(aleat);

        for (int i = 0; i < palabrita.length; i++) {
            palabrita[i] = "_  ";
            System.out.print(palabrita[i]);
        }

        do {
            if (fin < palabrita.length || vidas > 0) {
                System.out.println("\nPrueba con una letra");
                letra = sc.next();

                if (palabro.contains(letra)) {
                    do {
                        if (palabro.charAt(sumar) == letra.charAt(0)) {
                            palabrita[sumar] = letra;
                            fin++;
                        }
                        sumar++;
                    } while (sumar < palabro.length());

                    for (int i = 0; i < palabrita.length; i++) {
                        System.out.print(palabrita[i] + " ");
                    }
                    sumar = 0;

                } else {
                    vidas--;
                    if (vidas == 0) {
                        System.out.println("Te has quedado sin vidas");
                    }
                    if (vidas > 0) {
                        System.out.println("Una vida menos, te quedan " + vidas);
                        for (int i = 0; i < palabrita.length; i++) {
                            System.out.print(palabrita[i] + " ");
                        }
                    }
                }
                if (fin == palabrita.length) {
                    System.out.println("\nHAS GANADO");
                    salir = false;
                } else if (vidas == 0) {
                    System.out.println("Has perdido. La palabra era " + palabro);
                    salir = false;
                }
            }
        } while (salir);

    }
}