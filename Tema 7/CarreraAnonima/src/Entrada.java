import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres hacer \n1.Crear Carrera\n2.Validar Vehiculo\n3.Generar Ganador\n4.Ver ganador");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                Carrera carrera = new Carrera();
                break;
            case 2:
                break;
            case 3:
                //carrera.generarGanador();
                break;
            case 4:
                break;
        }


    }
}
