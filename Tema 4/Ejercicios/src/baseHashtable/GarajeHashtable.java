package baseHashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class GarajeHashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, Object[]> garaje = new Hashtable<>();

        int opcion;
        String busqueda;
        int suma = 0;
        String borrar;

        do {
            System.out.println("1. Añadir coche \n2. Listar coches\n3. Buscar coche(Por matricula)\n4. Mostrar costes de todos los coches\n5. Eliminar coche\n6. Vaciar coche\n7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Marca: ");
                    String marca = sc.next();
                    System.out.println("Modelo: ");
                    String modelo = sc.next();
                    System.out.println("Coste: ");
                    int coste = sc.nextInt();
                    System.out.println("Matricula : ");
                    String matricula = sc.next();

                    garaje.put(matricula, new Object[]{marca, modelo, coste, matricula});

                    break;

                case 2:

                    Enumeration<String> matriculas = garaje.keys();

                    while (matriculas.hasMoreElements()) {
                        String matriculaAct = matriculas.nextElement();
                        Object[] cocheAct = garaje.get(matriculaAct);

                        for (Object item : cocheAct) {
                            System.out.println(item);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Buscar coche");
                    busqueda = sc.next();

                    Object[] cocheAct = garaje.get(busqueda);

                    for (Object item:cocheAct) {
                        System.out.println(item);
                    }
                    break;

                case 4:
                    Enumeration<Object[]> costesTot = garaje.elements();

                    while(costesTot.hasMoreElements()){
                        Object[] elemento = costesTot.nextElement();

                        suma += (int)elemento[2];
                    }
                    System.out.println(suma);

                    break;
                case 5:
                    System.out.println("Que coche quieres eliminar");
                    borrar = sc.next();

                    garaje.remove(borrar);
                    break;

                case 6:
                    Enumeration<String> cocheTemp = garaje.keys();

                    while(cocheTemp.hasMoreElements()){
                        String matri = cocheTemp.nextElement();

                        garaje.remove(matri);
                    }
                    break;
                case 7:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }
        } while (opcion != 7) ;
    }
}
