package baseHashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class AgendaHashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, Object[]> agenda = new Hashtable<>();
        int opcion;

        do {
            System.out.println("1. Agregar persona\n2. buscar persona (por DNi)\n3. Borrar persona (por DNI) \n4. Listar perssona\n5. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;

                case 2:

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
