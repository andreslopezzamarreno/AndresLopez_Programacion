public class Entrada {
    public static void main(String[] args) {
        Partido partido = new Partido();
        Partido.Equipo atleti = partido.new Equipo("Atleti");
        Partido.Equipo sevilla = partido.new Equipo("Sevilla");


        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                partido.agregarLocales();
                partido.agregarVisitante();
            }
            System.out.println("El resultado en la "+(i+1)+" parte es: ");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.escribirClaficacion();
        partido.reiniciarPartido();

    }
}
