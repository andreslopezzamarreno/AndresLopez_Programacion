import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        String nombre, apellido, dni, posicion, vocacion;
        int edad;
        double sueldo;

        System.out.println("Crear selección. Que nombre quieres que tenga:");
        nombre = sc.next();
        Seleccion seleccion = new Seleccion(nombre);

        /*do {
            System.out.println("Crear jugador \nnombre: ");
            nombre = sc.next();
            System.out.println("Apellido: ");
            apellido = sc.next();
            System.out.println("DNI: ");
            dni = sc.next();
            System.out.println("Edad: ");
            edad = sc.nextInt();
            System.out.println("Sueldo:");
            sueldo = sc.nextDouble();
            System.out.println("Posicion (delantero, medio, defensa o portero)");
            posicion = sc.next();
            Jugador jugador = new Jugador(nombre, apellido, dni, edad, sueldo, posicion);
            seleccion.contratarJugador(jugador);
        } while (seleccion.getListaPersonas().size() < 4);

        do {
            System.out.println("Crear Entrenador \nnombre: ");
            nombre = sc.next();
            System.out.println("Apellido: ");
            apellido = sc.next();
            System.out.println("DNI: ");
            dni = sc.next();
            System.out.println("Edad: ");
            edad = sc.nextInt();
            System.out.println("Sueldo:");
            sueldo = sc.nextDouble();
            System.out.println("vocacion (defensiva u ofensiva)");
            vocacion = sc.next();
            Entrenador entrenador = new Entrenador(nombre, apellido, dni, edad, sueldo, vocacion);
            seleccion.contratarEntrenador(entrenador);
        } while (seleccion.getListaPersonas().size() < 6);*/

        Entrenador entrenador = new Entrenador("nombre", "apellido", "123", 34,
                1000, "defensivo");
        Entrenador entrenador2 = new Entrenador("nombre2", "apellido2", "1234", 30,
                1500, "ofensivo");
        seleccion.contratarEntrenador(entrenador);

        Jugador jugador = new Jugador("nombre3", "apellido3", "12345", 24, 2000, "delantero");
        Jugador jugador2 = new Jugador("nombre3", "apellido3", "12345", 24, 2000, "delantero");
        Jugador jugador3 = new Jugador("nombre3", "apellido3", "12345", 24, 2000, "delantero");
        Jugador jugador4 = new Jugador("nombre3", "apellido3", "12345", 24, 2000, "delantero");
        seleccion.contratarJugador(jugador);



        System.out.println("Los delanteros son: ");
        seleccion.verPosicion("delantero");

        System.out.println();
        seleccion.mostrarGastos();

        System.out.println();
        seleccion.verPlantilla();
    }
}
