import java.util.Scanner;

public class DatosEstadisticos {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);

        int edad = 0;
        int nAlumnos = 0;
        int sumaEdades= 0;
        int mayores = 0;


        do {
            System.out.println("Introduce edad:");
            edad = in.nextInt();

            if (edad > 0) {
                nAlumnos ++;
                // sumaEdades = sumaEdades + edad;
                sumaEdades += edad;

                if (edad >= 18){
                    mayores ++;
                }
            }
        }while (edad > 0);

        System.out.println("El numero de alumnos es " + nAlumnos);
        System.out.println("La suma de las edades es " + sumaEdades);
        System.out.println("La media de las edades es " + (sumaEdades/nAlumnos));
        System.out.println("Los alumnos mayores de edad son "+ mayores );

        in.close();

    }
}
