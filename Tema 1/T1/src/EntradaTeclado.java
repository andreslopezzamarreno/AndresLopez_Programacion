import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {

        String nombre;
        int edad;
        char grupoSang;
        String palabraUno;
        String palabraDos;

        Scanner lecturaTeclado = new Scanner(System.in);

        //comparacion de palabras
        System.out.println("introduce palabra 1: ");
        palabraUno = lecturaTeclado.next();
        System.out.println("introduce palabra 2: ");
        palabraDos = lecturaTeclado.next();

        boolean comparacion = palabraUno.equals(palabraDos);
        System.out.println(comparacion);
        boolean comparacionCase = palabraUno.toLowerCase().equals(palabraDos.toLowerCase());
        System.out.println(comparacionCase);

        System.out.println("por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("por favor introduce edad ");
        edad = lecturaTeclado.nextInt();
        System.out.println("por favor introduce tu grupo sanguineo");
        grupoSang = lecturaTeclado.next().charAt(0);

        //System.out.println("mi nombre es " + nombre + " y tengo "+ edad + " años " +" y mi grupo sanguineo es " + grupoSang);
        System.out.printf("mi nombre es %s y tengo %d y mi grupo sanguineo es %c%n",
                nombre, edad, grupoSang);


    }
}
