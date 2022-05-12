import controller.ControllerBD;
import model.Alumno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControllerBD controllerBD = new ControllerBD();

        String nombre;
        String apellido;
        int edad,opcion;
       // controllerBD.insertarAlumnoPreparedStatement();

/*
        do {
            System.out.println("Añadir alumno\nIntroduce nombre");
            nombre = sc.next();
            System.out.println("Introduce apellido");
            apellido = sc.next();
            System.out.println("Introduce edad");
            edad = sc.nextInt();
            Alumno alumno = new Alumno(nombre,apellido,edad);
            controllerBD.insertarAlumnoEjercicio(alumno);

            System.out.println("Quieres seguir introduciendo alumnos (1/0)");
            opcion = sc.nextInt();
        }while(opcion == 1);
*/
/*
        System.out.println("De quien quieres cambiar la edad");
        nombre = sc.next();
        System.out.println("cambiar edad");
        edad = sc.nextInt();
        controllerBD.cambiarEdad(nombre,edad);
 */
        /*
        System.out.println("Edad de los usuarios que quieres borrar");
        edad = sc.nextInt();
        controllerBD.borrarUsuario(edad);

         */
        controllerBD.getResultados();
    }
}
