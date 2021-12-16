import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object[]> garaje = new ArrayList<>();
        int opcion;
        Object[] coche;
        String busqueda;
        int suma= 0;

        do {
            System.out.println("1. Añadir coche \n2. Listar coches\n3. Buscar coche(Por matricula)\n4. Mostrar costes de todos los coches\n5. Eliminar coche\n6. Vaciar coche");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    coche = new Object[4];
                    System.out.println("Marca: ");
                    coche[0] = sc.next();
                    System.out.println("Modelo: ");
                    coche[1] = sc.next();
                    System.out.println("Coste: ");
                    coche[2] = sc.nextInt();
                    System.out.println("Matricula : ");
                    coche[3] = sc.next();

                    garaje.add(coche);
                    break;
                case 2:
                    for (Object[] car : garaje) {
                        for (Object item : car) {
                            System.out.print(item + " \t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Buscar coche");
                    busqueda = sc.next();
                    for (Object[] car: garaje) {
                        if ((car[3]).equals(busqueda)){
                            for (Object item: car ) {
                                System.out.print(item + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    for (Object[] car :garaje) {
                        suma += (int) car[2];
                    }
                    System.out.println("El coste acomulado de todos los coches es: " + suma);
                    break;
                case 5:

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);


    }
}
