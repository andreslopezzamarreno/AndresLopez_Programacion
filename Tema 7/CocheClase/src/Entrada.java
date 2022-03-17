public class Entrada {

    public static void main(String[] args) {
        Coche coche = new Coche(1000, 220, "audi", "a4");
        coche.mostrarDatos();

        Coche.Motor motor = coche.new Motor(211,300);
        Coche.Motor motor2 = coche.new Motor(40,100);
        coche.mostrarDatos();
        m
    }

}
