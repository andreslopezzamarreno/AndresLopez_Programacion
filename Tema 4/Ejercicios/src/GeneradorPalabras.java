import java.util.Scanner;

public class GeneradorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] palabras;
        int num;
        System.out.println("Cuantas palabras quieres guardar?");
        num = sc.nextInt();
        palabras = new String[num];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=" ";
        }

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Que logitud tiene la palabra " + (i+1));
            int longitud = sc.nextInt();
            for (int j = 0; j < longitud; j++) {
                int letra =(int) (Math.random()*abc.length);
                palabras[i] += abc[letra];
            }
        }
        System.out.println("Las palabras generadas son: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i+1)+". "+ palabras[i]);
        }
    }
}
