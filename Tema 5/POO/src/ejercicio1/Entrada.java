package ejercicio1;

public class Entrada {

    public static void main(String[] args) {

        Motor motorGasoil = new Motor(150, 1000);
        Motor motorGasolina = new Motor(120, 500);

        Coche cocheGasolina = new Coche(motorGasolina, "ford","fiesta");
        Coche cocheGasoil = new Coche(motorGasoil, "oper","corsa");

        /*System.out.println(cocheGasoil.getMotor().getCv());

        System.out.println(cocheGasoil.getCosteAverias());

        cocheGasoil.acumularAveria(900);
        cocheGasoil.acumularAveria(200);

        System.out.println(cocheGasoil.getCosteAverias());*/

        Garaje garaje = new Garaje();

        if (garaje.aceptarCoche(cocheGasolina,"aceite")){
            System.out.println("Coche aceptado");
        } else {
            System.out.println("Garaje ocupado");
        }
    }

}
