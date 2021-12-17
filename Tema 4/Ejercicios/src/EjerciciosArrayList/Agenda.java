package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Object[]> agenda = new ArrayList<>();
        Object[] persona;
        String busqueda;
        int opcion;
        boolean encontrado;
        boolean añadido = false;

        do {
            System.out.println("1. Agregar persona\n2. buscar persona (por DNi)\n3. Borrar persona (por DNI) \n4. Listar perssona\n5. Salir ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    persona = new Object[4];
                    System.out.println("Nombre");
                    String nombre = sc.next();
                    System.out.println("Apellido");
                    String apellido = sc.next();
                    System.out.println("Telefono");
                    int telefono = sc.nextInt();
                    System.out.println("DNI");
                    String dni = sc.next();
                    persona = new Object[]{nombre,apellido,telefono,dni};
                    for ( Object[] item: agenda) {
                        if (item[3].toString().equalsIgnoreCase(dni)){
                            añadido = true;
                            break;
                        }
                    }

                    if(!añadido){
                        agenda.add(persona);
                        System.out.println("persona añadida");
                    }else{
                        System.out.println("Persona ya añadida");
                    }
                    break;

                case 2:
                    encontrado = false;
                    if (agenda.size() > 0) {
                        System.out.println("Que persona quieres buscar (Por DNI)");
                        busqueda = sc.next();
                        for (Object[] pers : agenda) {
                            if (pers[3].toString().equalsIgnoreCase(busqueda)) {
                                System.out.println("Nombre: " + pers[0] + "\nApellido: " + pers[1] + "\nTelefono: " + pers[2]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se ha encontrado la persona");
                        }
                        break;
                    } else {
                        System.out.println("No hay personas registradas");
                    }
                    break;

                case 3:
                    encontrado = false;
                    if (agenda.size() > 0) {
                        System.out.println("Que persona quieres eliminar (Por DNI)");
                        busqueda = sc.next();
                        for (Object[] pers : agenda) {
                            if (pers[3].toString().equalsIgnoreCase(busqueda)) {
                                agenda.remove(pers);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se ha encontrado la persona");
                        }
                        break;
                    } else {
                        System.out.println("No hay personas registradas");
                    }
                    break;

                case 4:
                    if (agenda.size() > 0) {
                        for (Object[] pers : agenda) {
                            System.out.println("Nombre: " + pers[0] + "\nApellido: " + pers[1] + "\nTelefono: " + pers[2] + "\nDNI: " + pers[3]);
                            System.out.println();
                        }
                        break;
                    } else {
                        System.out.println("No hay personas registradas");
                    }
                    break;

                case 5:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
    }
}
