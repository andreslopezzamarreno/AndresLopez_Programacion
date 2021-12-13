import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object[]> coche = new ArrayList();

        coche.add(new Object[]{"Mercedes", "C220", 250, "asd123"});
        coche.add(new Object[]{"Audi", "A5", 350});
        coche.add(new Object[]{"BMW", "IX3", 286,false});
        coche.add(new Object[]{"Ford", "Focus", 150,true, 5.98});

        /*Object[] cocheSeleccionado = coche.get(3);
        System.out.println(cocheSeleccionado[1]);
        System.out.println(coche.get(2)[0]);*/

        for (int i = 0; i < coche.size(); i++) {
            //mi intento
            /*for (int j = 0; j < coche.get(i).length-1; j++) {
                System.out.print("marca: " + coche.get(i)[j]);
                j++;
                System.out.print("modelo: " + coche.get(i)[j]);
                j++;
                System.out.print("cv: " + coche.get(i)[j]);


            }*/
            //resuelto por borja
            Object[]cocheActual = coche.get(i);
            for (int j = 0; j < cocheActual.length; j++) {
                System.out.print("\t" + cocheActual[j]);
            }
            System.out.println();
        }

        for (Object[] car : coche) {

            /*System.out.println("Marca: " + car[0]);
            System.out.println("Modelo: " + car[1]);
            System.out.println("CV: " + car[2]);*/

            for (Object item :car) {
                System.out.print(item + " \t");
            }
            System.out.println();
        }


        coche.add(new Object[]{"Ford", "fiesta", 150});
        coche.add(new Object[]{"Audi", "A6", 230});
        coche.add(new Object[]{"Mercedes", "eqs", 190});
        coche.add(new Object[]{"Audi", "q5", 123});
        coche.add(new Object[]{"Ford", "mondeo", 170});
        coche.add(new Object[]{"BMW", "IX3", 286,});

        System.out.println("Que marca quieres buscar?");
        String busqueda = sc.next();
        for (Object[] car: coche) {
            if (((String)car[0]).equalsIgnoreCase(busqueda)){
                for (Object item: car ) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }
        }
    }
}
