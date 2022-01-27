package agenda;

import java.util.Enumeration;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        String nombre;
        int telefono;
        String dni;
        String busqueda;
        do {
            System.out.println("Que quieres hacer\n1.Agregar persona a la agenda\n2.Borrar persona (según el DNI introducido)\n" +
                    "3.Editar persona (según el DNI introducido)\n4.Buscar persona (según DNI introducido)\n5.Listar agenda\n6.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Añadir persona\nNombre:");
                    nombre = sc.next();
                    System.out.println("Telefono");
                    telefono = sc.nextInt();
                    System.out.println("DNI");
                    dni = sc.next();
                    if(!agenda.getAgenda().containsKey(dni)) {
                        Persona persona = new Persona(nombre, telefono, dni);
                        agenda.agregar(persona);
                        System.out.println("Persona añadida\n");
                    }else{
                        System.out.println("La persona ya existe\n");
                    }
                    break;

                case 2:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Eliminar persona (por DNI)");
                        busqueda = sc.next();
                        agenda.borrar(busqueda);
                    }else{
                        System.out.println("Agenda vacia\n");
                    }
                    break;

                case 3:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Editar persona (por DNI)");
                        busqueda = sc.next();
                        agenda.editar(busqueda);
                    }else{
                        System.out.println("Agenda vacia\n");
                    }
                    break;

                case 4:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Buscar persona (por DNI)");
                        busqueda = sc.next();
                        agenda.buscar(busqueda);
                    }else{
                        System.out.println("Agenda vacia\n");
                    }

                    break;
                case 5:
                    if (!agenda.getAgenda().isEmpty()) {
                        agenda.listar();
                    }else{
                        System.out.println("Agenda vacia\n");
                    }
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (opcion != 6);
    }
}
