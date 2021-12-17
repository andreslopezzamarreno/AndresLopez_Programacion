package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object[]> garaje = new ArrayList<>();
        int opcion;
        Object[] coche;
        String busqueda;
        int suma;
        boolean encontrado;

        do {
            System.out.println("1. Añadir coche \n2. Listar coches\n3. Buscar coche(Por matricula)\n4. Mostrar costes de todos los coches\n5. Eliminar coche\n6. Vaciar coche\n7. Salir");
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
                    if(garaje.size()<5){
                        System.out.println("coche recepcionado");
                        garaje.add(coche);
                    }else{
                        System.out.println("No hay espacio disponible");
                    }
                    break;

                case 2:
                    if(garaje.size()>0){
                        for (Object[] car : garaje) {
                            for (Object item : car) {
                                System.out.print(item + " \t");
                            }
                            System.out.println();
                        }
                    }else{
                        System.out.println("No hay coches registrados ");
                    }

                    break;

                case 3:
                    encontrado= false;
                    if(garaje.size()>0){
                        System.out.println("Buscar coche");
                        busqueda = sc.next();
                        for (Object[] car : garaje) {
                            if ((car[3]).equals(busqueda)) {
                                for (Object item : car) {
                                    System.out.print(item + "\t");
                                }
                                System.out.println();
                                encontrado = true;
                                break;
                            }
                        }
                        if(!encontrado){
                            System.out.println("Coche no encontrado ");
                        }
                    }else{
                        System.out.println("No hay coches registrados");
                    }
                    break;

                case 4:
                    suma = 0;
                    for (Object[] car : garaje) {
                        suma += (int) car[2];
                    }
                    System.out.println("El coste acomulado de todos los coches es: " + suma);
                    break;

                case 5:
                    encontrado = false;
                    System.out.println("eliminar coche (por matricula)");
                    busqueda = sc.next();
                    for (Object[] car : garaje) {
                        if ((car[3]).equals(busqueda)) {
                            garaje.remove(car);
                            System.out.println("Coche eliminado");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado ){
                        System.out.println("Coche no encontrado");
                    }
                    break;

                case 6:
                    for (int i = 0; i < garaje.size(); i++) {
                        garaje.clear();
                    }
                    break;

                case 7:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);


    }
}
