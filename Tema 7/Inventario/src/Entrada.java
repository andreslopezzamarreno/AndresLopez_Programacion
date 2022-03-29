public class Entrada {
    public static void main(String[] args) {

        Silla silla = new Silla("roble", 5,100, 4);
        silla.calcularPrecio();

        Carne filete = new Carne("superior","galicia",100,50);
        filete.calcularPrecio();

        Mesa mesa = new Mesa("nogal",20,300,6);
        mesa.calcularPrecio();

        Lacteo leche = new Lacteo("premium","asturias",50,100);
        leche.calcularPrecio();

        SupermercadoEspecifico<Alimento> supermercadoAlimentos = new SupermercadoEspecifico();
        supermercadoAlimentos.añadirGenero(filete);
        supermercadoAlimentos.añadirGenero(leche);
        //supermercadoAlimentos.mostrarPrecioFinal();
        //supermercadoAlimentos.listarDatos();

        SupermercadoEspecifico<Mueble> supermercadoMuebles = new SupermercadoEspecifico();
        supermercadoMuebles.añadirGenero(silla);
        supermercadoMuebles.añadirGenero(mesa);
        //supermercadoMuebles.mostrarPrecioFinal();
        //supermercadoMuebles.listarDatos();

        SupermercadoEspecifico<Inventariable> supermercadoGenerico = new SupermercadoEspecifico<>();

    }
}
