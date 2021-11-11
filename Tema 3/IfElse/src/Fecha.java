package ifelse;

import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.println("introduce fecha:");
        System.out.println("Dia:");
        dia = sc.nextInt();
        System.out.println("Mes:");
        mes = sc.nextInt();
        System.out.println("Año:");
        anio = sc.nextInt();

        if ((mes > 0 && mes < 13) && (dia > 0 && dia < 32)) {
            switch (mes) {
                case 2:
                    if (dia > 29) {
                        System.out.println("fecha incorreta");
                    } else if (dia == 29) {
                        if (anio % 4 != 0) {
                            System.out.println("Fecha incorrecta");
                        } else {
                            System.out.println(dia + "/" + mes + "/" + anio);
                        }
                    } else {
                        System.out.println(dia + "/" + mes + "/" + anio);
                    }
                    break;
                case 4 | 6 | 9 | 11:
                    if (dia > 30) {
                        System.out.println("Fecha incorrecta");
                    } else {
                        System.out.println(dia + "/" + mes + "/" + anio);
                    }
                    break;
                default:
                    System.out.println(dia + "/" + mes + "/" + anio);
                    break;

            }
        } else {
            System.out.println("ERROR");
        }
    }
}
