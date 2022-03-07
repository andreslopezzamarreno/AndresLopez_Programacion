public class Entrada {
    public static void main(String[] args) {

        Persona persona = new Jugador("andres", "lopez", 123,Posiciones.medio.getDefinicion());
        Jugador jugador = new Jugador("andres2", "lopez2", 1234,Posiciones.medio.getDefinicion());


        Seleccion seleccion= new Seleccion();

        seleccion.addPersona(persona);
        seleccion.addPersona(jugador);
    }
}
