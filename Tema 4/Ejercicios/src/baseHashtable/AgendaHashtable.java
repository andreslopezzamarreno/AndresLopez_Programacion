package baseHashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class AgendaHashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, Object[]> agenda = new Hashtable<>();
        int opcion;
        String nombre;
        String apellido;
        int telefono;
        String dni;
        String busqueda;

        do {
            System.out.println("1. Agregar persona\n2. buscar persona (por DNi)\n3. Borrar persona (por DNI) \n4. Listar perssona\n5. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    nombre = sc.next();
                    System.out.println("Apellido: ");
                    apellido = sc.next();
                    System.out.println("Numero de telefono: ");
                    telefono = sc.nextInt();
                    System.out.println("Dni: ");
                    dni = sc.next();

                    agenda.put(dni , new Object[]{nombre,apellido,telefono,dni});
                    break;

                case 2:
                    if (!agenda.isEmpty()) {

                    }


                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Salir");
                    break;
            }
        } while (opcion != 5);
    }
}
