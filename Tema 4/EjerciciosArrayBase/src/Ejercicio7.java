import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] palabras = new String[10];
        int opcion = -1;
        int numeroLetras=0;
        String palabra;
        double mediaLetras;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce palabra:");
            palabras[i] = sc.next();
        }
        do{
            System.out.println("Que quieres hacer ?");
            System.out.println("1.Mostrar todas las palabras\n2.Obtener una palabra al azar\n3.Ver número de letras totales en el Array\n" +
                    "4.Ver media de letras\n5.Ver palabra con más letras\n6.Ver palabra con menos letras\n0.Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(palabras[i]);
                    }
                    break;
                case 2:
                    System.out.println(palabras[(int) (Math.random()*10)]);
                    break;
                case 3:
                    numeroLetras = 0;
                    for (int i = 0; i < 10; i++) {
                        palabra = palabras[i];
                        numeroLetras += palabra.length();
                    }
                    System.out.println("El numero de letras totales es: " + numeroLetras);
                    break;
                case 4:
                    numeroLetras = 0;
                    for (int i = 0; i < 10; i++) {
                        palabra = palabras[i];
                        numeroLetras += palabra.length();
                    }
                    mediaLetras =(double) numeroLetras/(double) palabras.length;
                    System.out.println("La media de letras por palabras es " + mediaLetras);
                    break;
                case 5:
                    
            }
        }while (opcion != 0);
    }
}
