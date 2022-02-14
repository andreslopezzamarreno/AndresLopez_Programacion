public class Entrada {
    public static void main(String[] args) {
        /*Coche coche = new Coche("123A","123",100,2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        Deportivo deportivo = new Deportivo("234B","234",200,2500,600);
        System.out.println(deportivo.getMatricula());
        deportivo.calcularVelocidad(120);

        Suv suv = new Suv("345","5434",177,2000,false);
        suv.mostrarDatos();*/

        Concesionario concesionario = new Concesionario();
        Deportivo deportivo = new Deportivo("234B","234",200,2500,600);
        Suv suv = new Suv("345","5434",177,2000,false);

        concesionario.agregar(suv);
        concesionario.listar();
        concesionario.agregar(deportivo);
        concesionario.listar();
        concesionario.buscar(deportivo);
        concesionario.borrar("345");
        concesionario.listar();
        concesionario.clasificar();
    }
}
