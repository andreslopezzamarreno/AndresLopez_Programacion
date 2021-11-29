import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[0];
        boolean creacion = false;
        int opcion;
        int tamaño = -1;
        int posInicial;

        do {
            System.out.print("1.Introducir tamaño del Array \n2.Rellenar Array \n3.Sacar posiciones donde el valor sea menor que 10 y par " +
                    "\n4.Rotar posiciones a la izquierda\n5.Sacar todas las posiciones del array \n6.salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introducir tamaño del array");
                    tamaño = sc.nextInt();
                    if (tamaño > 0) {
                        nums = new int[tamaño];
                    } else {
                        System.out.println("Error. El numero introducido es 0 o negativo");
                    }

                    System.out.println();
                    break;
                case 2:
                    System.out.println("Rellenar array con numeros aleatorios");
                    if (tamaño != -1) {
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = (int) (Math.random() * 101);
                            creacion = true;
                        }
                    } else {
                        System.out.println("Error. El array aun no se ha creado.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Sacar posiciones donde el valor sea menor que 10 y par ");
                    if (creacion) {
                        for (int i = 0; i < nums.length; i++) {
                            if (nums[i] > 10 && nums[i] % 2 == 0) {
                                System.out.println("posicion " + i + ": " + nums[i] + "  ");
                            }
                        }
                    } else {
                        System.out.println("Error. El array aun no se ha creado.");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    if (creacion) {
                        System.out.println("Rotar las posiciones a la izquierda");
                        posInicial = nums[0];
                        for (int i = 0; i < nums.length; i++) {
                            if (nums[i] != nums[nums.length - 1]) {
                                nums[i] = nums[i + 1];
                            } else {
                                nums[i] = posInicial;
                            }

                            System.out.print(nums[i] + "  ");
                        }
                    } else {
                        System.out.println("Error. El array aun no se ha creado.");
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    if (creacion) {
                        for (int i = 0; i < nums.length; i++) {
                            System.out.print(nums[i] + "  ");
                        }
                    } else {
                        System.out.println("Error. El array aun no se ha creado.");
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("Salir ");
                    break;
                default:
                    System.out.println("Error. Opcion no valida");

            }
        } while (opcion != 6);

    }
}
