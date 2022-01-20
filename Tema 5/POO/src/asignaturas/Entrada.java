package asignaturas;

public class Entrada {
    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1);
        Asignatura entornos = new Asignatura(2);
        Asignatura bbdd = new Asignatura(3);


        Alumno juan = new Alumno(programacion,entornos,bbdd);
        Alumno diego = new Alumno(4,5,6);

        Profesor alberto = new Profesor();

        alberto.ponerNotas(juan);

        System.out.println(juan.getAsignatura1().getCalificacion());
        System.out.println(juan.getAsignatura2().getCalificacion());
        System.out.println(juan.getAsignatura3().getCalificacion());

        System.out.println(alberto.calcularMadia(juan));


    }
}
