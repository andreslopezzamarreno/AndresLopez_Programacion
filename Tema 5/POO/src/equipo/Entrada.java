package equipo;

public class Entrada {
    public static void main(String[] args) {

        Equipo RMA = new Equipo("RMA");
        Equipo ATM = new Equipo("ATM", 70,34,40);

        /*for (int i = 0; i < 3; i++) {
            equipo1.atacar();
            equipo2.atacar();
            System.out.println("El resultado es: " + equipo1.getNombre()+" "+equipo1.getGoles() + " - "+ equipo2.getNombre()+" " +equipo2.getGoles());
        }
        System.out.println("El resultado final del partido es: " + equipo1.getNombre() + " " + equipo1.getGoles()+" - "+ equipo2.getNombre()+" " +equipo2.getGoles());
*/
        Partido partido = new Partido (RMA,ATM);
        Jugador jugador1 = new Jugador("alberto","delantero",89);
        Jugador jugador2 = new Jugador("juan","delantero",96);
        Jugador jugador3 = new Jugador("alfredo","defesa",89);
        Jugador jugador4 = new Jugador("andres","medio centro",39);
        Jugador jugador5 = new Jugador("lucas","portero",89);
        Jugador jugador6 = new Jugador("miguel","portero",90);

        RMA.añadirJugador(jugador1);
        ATM.añadirJugador(jugador2);
        RMA.añadirJugador(jugador5);
        ATM.añadirJugador(jugador6);
        RMA.añadirJugador(jugador4);
        ATM.añadirJugador(jugador3);

        RMA.mostrarDelanteros();
        ATM.mostrarDelanteros();

        partido.iniciarPartido();
        partido.mostrarResultado();
    }
}
