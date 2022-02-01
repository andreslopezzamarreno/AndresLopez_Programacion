package agenda;

import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda2 agenda2 = new Agenda2();
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
                    Persona persona = new Persona(nombre, telefono, dni);
                    agenda2.agregar2(persona);
                    break;

                case 2:
                    System.out.println("Que persona quieres borrar");
                    busqueda = sc.next();
                    agenda2.borrar2(busqueda);
                    break;

                case 3:
                    System.out.println("Editar persona (por DNI)");
                    busqueda = sc.next();
                    agenda2.editar2(busqueda);
                    break;

                case 4:
                    System.out.println("Buscar persona (por DNI)");
                    busqueda = sc.next();
                    agenda2.buscar2(busqueda);
                    break;

                case 5:
                    agenda2.listar2();
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
