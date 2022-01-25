package agenda;

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
                    do{
                        System.out.println("Telefono");
                        telefono = sc.nextInt();
                        if (telefono<=600000000 || telefono>=699999999){
                            System.out.println("Introduzca telefono correcto");
                        }
                    }while (telefono>=600000000 && telefono<=699999999);

                    System.out.println("DNI");
                    dni = sc.next();
                    Persona persona = new Persona(nombre,telefono,dni);
                    agenda.getAgenda().put(dni,persona);
                    System.out.println("Persona añadida\n");
                    break;

                case 2:
                    if(!agenda.getAgenda().isEmpty()){

                    }else{
                        System.out.println("Agenda vacia");
                    }
                    break;

                case 3:
                    if(!agenda.getAgenda().isEmpty()){

                    }else{
                        System.out.println("Agenda vacia");
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
                        System.out.println("Agenda vacia");
                    }

                    break;
                case 5:
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
