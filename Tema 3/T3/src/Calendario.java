import java.util.Scanner;
import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Como te llamas:");
        nombre = sc.next();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        int anio = calendar.get(Calendar.YEAR);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);

        System.out.printf("Son las %d:%d del %d del %d de %d ", hora, minutos, dia, mes +1, anio);
    }
}
