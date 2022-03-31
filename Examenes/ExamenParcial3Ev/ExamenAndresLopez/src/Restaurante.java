import java.util.ArrayList;

public class Restaurante <T extends Pedido>{

    //variables
    private String nombre;
    private int numeroComensaleTotales;
    private ArrayList<T> listaPedidos;
    private double caja;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
        this.caja = 0;
        this.numeroComensaleTotales = 0;
    }

    //metodos
    public void colocarComensales(int numero){
        try{
            if(numeroComensaleTotales + numero >50){
                throw new Excepcion("Restaurante lleno");

            }else{
                numeroComensaleTotales += numero;
            }
        }catch (Excepcion e){
            System.out.println("Restaurante lleno\n");
        }
    }

    public void registrarPedidos(T pedido){
        listaPedidos.add(pedido);
        caja += pedido.precio;
    }

    public void verPedidos(){
        for (int i = 0; i < listaPedidos.size(); i++) {
            System.out.println("PEDIDO " + (i+1));
            listaPedidos.get(i).verFactura();
            System.out.println();
        }

        /*System.out.println();
        item.verFactura();*/
        System.out.println("El total de la caja es de " + caja);
        System.out.println();
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroComensaleTotales() {
        return numeroComensaleTotales;
    }

    public void setNumeroComensaleTotales(int numeroComensaleTotales) {
        this.numeroComensaleTotales = numeroComensaleTotales;
    }

    public ArrayList getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }


    final class Comida extends Pedido {

        //variables
        private TipoComida tipoComida;

        //constructores
        public Comida(double precio, int numeroConsumiciones, TipoComida tipoComida) {
            super(precio, numeroConsumiciones);
            this.tipoComida = tipoComida;
            calcularPrecioReal();
        }

        public Comida() {
        }

        //metodos
        @Override
        public void calcularPrecioReal() {
            precio += (precio * Constantes.IVA_COMIDA);
        }

        @Override
        public void verFactura() {
            System.out.println("Precio: "+ precio);
            System.out.println("Numero Consumiciones: "+ numeroConsumiciones);
            System.out.println("Tipo: "+ tipoComida.toString());
            System.out.println("Nombre: "+ nombre);
            System.out.println("CIF: "+ CIF);
        }

        //getter y setter
        public TipoComida getTipoComida() {
            return tipoComida;
        }

        public void setTipoComida(TipoComida tipoComida) {
            this.tipoComida = tipoComida;
        }
    }

    final class Bebida extends Pedido{

        //variables
        private TipoBebidas tipoBebidas;

        //constructores
        public Bebida(double precio, int numeroConsumiciones, TipoBebidas tipoBebidas) {
            super(precio, numeroConsumiciones);
            this.tipoBebidas = tipoBebidas;
            calcularPrecioReal();
        }

        public Bebida() {
        }

        //metodos
        @Override
        public void calcularPrecioReal() {
            precio += (precio * Constantes.IVA_BEBIDAS);
        }

        @Override
        public void verFactura() {
            System.out.println("Precio: "+ precio);
            System.out.println("Numero Consumiciones: "+ numeroConsumiciones);
            System.out.println("Tipo: "+ tipoBebidas.toString());
            System.out.println("Nombre: "+ nombre);
            System.out.println("CIF: "+ CIF);

        }

        //getter y setter
        public TipoBebidas getTipoBebidas() {
            return tipoBebidas;
        }

        public void setTipoBebidas(TipoBebidas tipoBebidas) {
            this.tipoBebidas = tipoBebidas;
        }
    }
}

