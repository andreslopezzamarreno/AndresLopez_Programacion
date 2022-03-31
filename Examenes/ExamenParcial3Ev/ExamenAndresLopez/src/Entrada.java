public class Entrada {
    public static void main(String[] args) {

        //Apartado 1
        Restaurante<Restaurante.Comida> restauranteComida = new Restaurante("RESTAURANTE PACO");


        //Apartado 2
        restauranteComida.colocarComensales(47);
        Restaurante.Comida pedidoComida1 = restauranteComida.new Comida(30,6,TipoComida.bocadillo);
        restauranteComida.registrarPedidos(pedidoComida1);

        restauranteComida.colocarComensales(5);
        Restaurante.Comida pedidoComida2 = restauranteComida.new Comida(45,5,TipoComida.menu);
        restauranteComida.registrarPedidos(pedidoComida2);


        //Apartado 3
        Restaurante<Restaurante.Bebida> restauranteBebida = new Restaurante("BAR JUANA");


        //Apartado 4
        restauranteBebida.colocarComensales(30);
        Restaurante.Bebida pedidoBebida1 = restauranteBebida.new Bebida(50,4,TipoBebidas.copa);
        restauranteBebida.registrarPedidos(pedidoBebida1);

        restauranteBebida.colocarComensales(4);
        Restaurante.Bebida pedidoBebida2 = restauranteBebida.new Bebida(12,4,TipoBebidas.cerveza);
        restauranteBebida.registrarPedidos(pedidoBebida2);


        //Apartado 5
        restauranteBebida.verPedidos();
        restauranteComida.verPedidos();


        //Apartado 6
        Restaurante<Pedido> restauranteDeTodo = new Restaurante("TAPEO ALBERTO");
        restauranteDeTodo.registrarPedidos(pedidoBebida1);
        restauranteDeTodo.registrarPedidos(pedidoComida1);

        restauranteDeTodo.verPedidos();
    }
}
