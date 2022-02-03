package parteB;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombrePizza;
        int idPizza;
        int numIngredientes;
        String ingredienteSc;

        Pizzeria pizzaCarlos = new Pizzeria();

        do {
            System.out.println("Que quieres hacer: \n1.Realizar pedido\n2.Servir pedido\n3.Ver pedidos pendientes\n4.Ver caja");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre : ");
                    nombrePizza = sc.next();
                    System.out.println("Id de la pizza: ");
                    idPizza = sc.nextInt();
                    Pizza pizza = new Pizza(nombrePizza, idPizza);
                    System.out.println("Cuantos ingrdientes quieres (Número): cebolla(1.10 €), pollo(2.2€), cerdo(2.2€), bacon(2.2€), barbacoa(2€), champiñones(1.9€), pimiento(1€), queso(2.5€), piña(0.9€), salami(1.6€)");
                    numIngredientes = sc.nextInt();
                    if (numIngredientes > 10) {
                        System.out.println("demasiados ingredientes");
                    } else {
                        for (int i = 0; i < numIngredientes; i++) {
                            System.out.println("introduce ingrediente");
                            ingredienteSc = sc.next();
                            for ( Ingrediente item: pizzaCarlos.getIngredientesDisponibles()) {
                                if (ingredienteSc.equalsIgnoreCase(item.getNombre())) {
                                    double precio = pizzaCarlos.getIngredientesDisponibles().get(i).getPrecio();
                                    Ingrediente ingrediente = new Ingrediente(ingredienteSc, precio);
                                    pizza.agregarIngredientes(ingrediente);
                                }
                            }
                        }
                        pizzaCarlos.agregarPedido(pizza);
                    }
                    break;

                case 2:
                    System.out.println("Que pedido vas a servir (Por id de pedido)");
                    idPizza = sc.nextInt();
                    pizzaCarlos.servirPedido(idPizza);
                    break;

                case 3:
                    pizzaCarlos.mostrarPedidosPendientes();
                    break;

                case 4:
                    System.out.println("La caja está ahora mismo a " + pizzaCarlos.getCaja() + " €");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);

    }
}
