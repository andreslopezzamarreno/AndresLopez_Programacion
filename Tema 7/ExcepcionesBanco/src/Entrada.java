import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) throws Excepcion {
        Scanner sc = new Scanner(System.in);

        int opcion,cantidad;
        ArrayList<String> errores = new ArrayList<>();
        Cuenta cuenta = new Cuenta(1,1234);
        boolean inicio = false;

        do{
            System.out.println("Que quieres hacer: \n1.Ingresar Dinero\n2.Sacar Dinero\n3.Ver saldo" +
                    "\n4.Ver errores\n-1.Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("¿Cuanto quieres ingresar?");
                    cantidad = sc.nextInt();
                    cuenta.ingresarDinero(cantidad);
                    break;
                case 2:
                    System.out.println("¿Cuanto quieres sacar?");
                    cantidad = sc.nextInt();
                    try{
                        if (cantidad >= cuenta.getSaldo()){
                            System.out.println("Saldo Insuficiente");
                            cuenta.sacarTodo();

                            throw new Excepcion("Saldo Insuficiente");
                        }else {
                            cuenta.sacarDinero(cantidad);
                        }
                    }catch (Excepcion e){
                        /*if (errores == null){
                            errores = new ArrayList<>();
                            inicio = true;
                        }*/
                        errores.add(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) +" "+ e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("El saldo de la cuenta es " + cuenta.getSaldo());
                    break;
                case 4:
                    //if(errores != null) {
                        for (String item : errores) {
                            System.out.println(item);
                        }
                    //}
                    break;
            }
        }while (opcion != -1);
    }
}
