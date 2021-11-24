import java.util.Scanner;

public class MultidimensionalAlumno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int numAlumnos = 0;
        Object[][] alumno = new Object[1][1];
        int sumaNotas = 0;
        String alumnos = "";
        double media = 0;

        do {
            System.out.println("1.Definir el número de alumnos a registrar\n2.Registrar alumnos\n3.Ver datos de alumnos con nota media\n4.Ver datos de un alumno concreto\n5.Ver medias de la asignatura 1\n" +
                    "6.Ver medias de la asignatura 2\n7.Ver medias de la asignatura 3\n8.Salir");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Numero de alumnos a registrar ");
                        numAlumnos = sc.nextInt();
                        if (numAlumnos <= 1) {
                            System.out.println("Error");
                        } else {
                            alumno = new Object[numAlumnos][4];
                        }
                    } while (numAlumnos <= 1);
                    break;

                case 2:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados");
                    } else if (alumno[1][1] != null) {
                        System.out.println("Error. Ya hay alumnos registrados");
                    } else {
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println("Introducir nombre de Alumno");
                            alumno[i][0] = sc.next();
                        }
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println("Introducir nota asignatura 1 de " + alumno[i][0]);
                            alumno[i][1] = sc.nextInt();
                        }
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println("Introducir nota asignatura 2 de " + alumno[i][0]);
                            alumno[i][2] = sc.nextInt();
                        }
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println("Introducir nota asignatura 3 de " + alumno[i][0]);
                            alumno[i][3] = sc.nextInt();
                        }
                    }
                    break;

                case 3:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados\n");
                    } else {
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println(alumno[i][0]);
                            System.out.println("Nota 1: " + alumno[i][1]);
                            System.out.println("Nota 2: " + alumno[i][2]);
                            System.out.println("Nota 3: " + alumno[i][3]);
                            for (int j = 1; j < alumno[i].length; j++) {
                                sumaNotas += (int) alumno[i][j];
                            }
                            System.out.printf("Nota media: %.2f", (double) sumaNotas / 3);
                            System.out.println();
                            sumaNotas = 0;
                        }
                    }
                    break;
                case 4:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados\n");
                    } else {
                        System.out.println("De que alumno quieres ver los datos ");
                        alumnos = sc.next();
                    }
                    for (int i = 0; i < alumno.length; i++) {
                        for (int j = 0; j < 1; j++) {
                            if (alumno[i][j].equals(alumnos)) {
                                System.out.println("Nombre: " + alumno[i][0]);
                                System.out.println("Nota 1: " + alumno[i][1]);
                                System.out.println("Nota 2: " + alumno[i][2]);
                                System.out.println("Nota 3: " + alumno[i][3]);
                            }
                        }
                    }
                    break;
                case 5:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados\n");
                    } else {
                        for (int i = 0; i < alumno.length; i++) {
                            for (int j = 1; j < alumno[i].length - 2; j++) {
                                media += (int) alumno[i][1];
                            }
                        }
                        media /= alumno.length;
                        System.out.println("La media de la asignatura 1 es: " + media);
                        media = 0;
                    }
                    break;
                case 6:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados\n");
                    } else {
                        for (int i = 0; i < alumno.length; i++) {
                            for (int j = 2; j < alumno[i].length - 1; j++) {
                                media += (int) alumno[i][2];
                            }
                        }
                        media /= alumno.length;
                        System.out.println("La media de la asignatura 2 es: " + media);
                    }
                    media = 0;
                    break;
                case 7:
                    if (numAlumnos <= 1) {
                        System.out.println("Error. No hay alumnos registrados\n");
                    } else {
                        for (int i = 0; i < alumno.length; i++) {
                            for (int j = 3; j < alumno[i].length; j++) {
                                media += (int) alumno[i][3];
                            }
                        }
                        media /= alumno.length;
                        System.out.println("La media de la asignatura 3 es: " + media);
                    }
                    media = 0;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 8);
    }
}
