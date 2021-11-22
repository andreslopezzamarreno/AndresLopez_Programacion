import java.util.Scanner;

public class MultidimensionalAlumno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int numAlumnos;

        do{
            System.out.println("1.Definir el número de alumnos a registrar\n2.Registrar alumnos\n3.Ver datos de alumnos con nota media\n4.Ver datos de un alumno concreto\n5.Ver medias de la asignatura 1\n" +
                    "6.Ver medias de la asignatura 2\n7.Ver medias de la asignatura 3\n8.Salir");
            opcion = sc.nextInt();

        }while(opcion<1 && opcion<8);


        switch (opcion){
            case 1:
                System.out.println("Numero de alumnos a registrar ");
                numAlumnos = sc.nextInt();
                if (numAlumnos<=1){
                    System.out.println("Error");
                }
                break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }


    }
}
