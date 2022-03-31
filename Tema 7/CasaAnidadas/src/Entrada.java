import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,m2,valor,numHabitaciones;
        String orientacion;
        boolean piscina;

        Terreno terreno;

        System.out.println("Que quieres hacer\n1.Crear terreno\n2.Crear casa\n3.Crear habitacion\n4.Crear anexo");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Metros cuadrados del terreno");
                m2 = sc.nextInt();
                System.out.println("Valor");
                valor= sc.nextInt();
                System.out.println("orientacion(norte, sur, este, oeste)");
                orientacion = sc.next();
                terreno = new Terreno(m2,valor,orientacion);
                break;
            case 2:
                System.out.println("Metros cuadrados");
                m2 = sc.nextInt();
                System.out.println("Numero habitaciones");
                numHabitaciones = sc.nextInt();
                System.out.println("Pincina (true/false)");
                piscina = sc.hasNext();
                if (terreno == null){
                    Terreno.Casa casa = terreno.new Casa(m2,numHabitaciones,piscina);
                }else{
                    System.out.println("Terreno no construido");
                }
                break;
            case 3:
                break;
            case 4:
                break;
        }




    }
}
