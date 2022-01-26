package agenda;

import java.util.Enumeration;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre;
        int telefono;
        String dni;
        Agenda agenda = new Agenda();
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
                    Persona persona = new Persona(nombre,telefono,dni);
                    agenda.getAgenda().put(dni,persona);
                    System.out.println("Persona añadida\n");
                    break;

                case 2:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Eliminar persona (por DNI)");
                        busqueda = sc.next();
                            if (agenda.getAgenda().containsKey(busqueda)){
                                agenda.getAgenda().remove(busqueda);
                                System.out.println("Persona borrada\n");
                            }else{
                                System.out.println("DNI no encontrado\n");
                            }
                    }else{
                        System.out.println("Agenda vacia\n");
                    }
                    break;

                case 3:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Editar persona (por DNI)");
                        busqueda = sc.next();
                        if (agenda.getAgenda().containsKey(busqueda)){
                            System.out.println("Que quieres editar?\n1.Nombre\n2.telefono");
                            opcion = sc.nextInt();
                            switch (opcion){
                                case 1:
                                    System.out.println("Nuevo Nombre");
                                    nombre = sc.next();
                                    agenda.getAgenda().get(busqueda).setNombre(nombre);
                                    break;
                                case 2:
                                    System.out.println("Nuevo telefono");
                                    telefono = sc.nextInt();
                                    agenda.getAgenda().get(busqueda).setTelefono(telefono);
                                    break;
                            }
                        }else{
                            System.out.println("DNI no encontrado\n");
                        }
                    }else{
                        System.out.println("Agenda vacia\n");
                    }
                    break;

                case 4:
                    if(!agenda.getAgenda().isEmpty()){
                        System.out.println("Buscar persona (por DNI)");
                        busqueda = sc.next();

                        Persona personaBusca = agenda.getAgenda().get(busqueda);

                        System.out.println(personaBusca.getNombre());
                        System.out.println(personaBusca.getTelefono());
                        System.out.println(personaBusca.getDni()+ "\n");

                    }else{
                        System.out.println("Agenda vacia\n");
                    }

                    break;
                case 5:
                    if (!agenda.getAgenda().isEmpty()) {
                        Enumeration<String> claves = agenda.getAgenda().keys();

                        while (claves.hasMoreElements()) {
                            String dniAct = claves.nextElement();
                            Persona persona1 = agenda.getAgenda().get(dniAct);
                            System.out.println("Nombre: " + persona1.getNombre() + "\nTelefono:" + persona1.getTelefono() + "DNI: " + persona1.getDni() + "\n");
                        }
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
