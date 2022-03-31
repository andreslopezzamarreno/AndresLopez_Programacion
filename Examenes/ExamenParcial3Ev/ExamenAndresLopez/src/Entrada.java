import jdk.swing.interop.SwingInterOpUtils;

public class Entrada {
    public static void main(String[] args) {

        //Apartado 1
        Restaurante<Restaurante.Comida> restauranteComida = new Restaurante("RESTAURANTE PACO");


        //Apartado 2
        restauranteComida.colocarComensales(40);
        Restaurante.Comida pedidoComida1 = restauranteComida.new Comida(30,6,TipoComida.bocadillo);
        restauranteComida.registrarPedidos(pedidoComida1);

        restauranteComida.colocarComensales(5);
        Restaurante.Comida pedidoComida2 = restauranteComida.new Comida(45,5,TipoComida.menu);
        restauranteComida.registrarPedidos(pedidoComida2);


        //Apartado 3
        Restaurante<Restaurante.Bebida> restauranteBebida = new Restaurante("BAR JUANA");


        //Apartado 4
        restauranteBebida.colocarComensales(45);
        Restaurante.Bebida pedidoBebida1 = restauranteBebida.new Bebida(50,4,TipoBebidas.copa);
        restauranteBebida.registrarPedidos(pedidoBebida1);

        restauranteBebida.colocarComensales(7);
        Restaurante.Bebida pedidoBebida2 = restauranteBebida.new Bebida(12,4,TipoBebidas.cerveza);
        restauranteBebida.registrarPedidos(pedidoBebida2);


        //Apartado 5
        System.out.println("PEDIDOS RESTAURANTE PACO");
        restauranteComida.verPedidos();
        System.out.println("PEDIDOS BAR JUANA");
        restauranteBebida.verPedidos();


        //Apartado 6
        Restaurante<Pedido> restauranteDeTodo = new Restaurante("TAPEO ALBERTO");

        restauranteDeTodo.colocarComensales(15);
        Restaurante.Bebida pedidoBebida3 = restauranteDeTodo.new Bebida(135,15,TipoBebidas.refresco);
        restauranteDeTodo.registrarPedidos(pedidoBebida3);

        restauranteDeTodo.colocarComensales(5);
        Restaurante.Comida pedidoComida3 = restauranteComida.new Comida(65,8,TipoComida.racion);
        restauranteDeTodo.registrarPedidos(pedidoComida3);

        System.out.println("PEDIDOS TAPEO ALBERTO");
        restauranteDeTodo.verPedidos();
    }
}
