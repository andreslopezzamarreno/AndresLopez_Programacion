package TrabajadoresHerencia;

public class Entrada {
    public static void main(String[] args) {

        Jefe juan = new Jefe("juan", "2342423","lopez", 60,8000);
        Asalariado andres = new Asalariado("lucas","45345","ramirez",2000,14,false);
        Empresa empresa = new Empresa(juan);

        juan.mostrardatos();


    }
}
