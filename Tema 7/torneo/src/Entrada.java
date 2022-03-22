public class Entrada {
    public static void main(String[] args) {

        Torneo torneo = new Torneo("Liga de campeones");

        Torneo.Equipo equipo1 = new Torneo.Equipo("Andel fc");
        Torneo.Equipo equipo2 = new Torneo.Equipo("Boca juniors");
        Torneo.Equipo equipo3 = new Torneo.Equipo("Fuenlabrada");
        Torneo.Equipo equipo4 = new Torneo.Equipo("Alcoyano");
        Torneo.Equipo equipo5 = new Torneo.Equipo("Boadilla");
        Torneo.Equipo equipo6 = new Torneo.Equipo("Alamo");

        equipo1.inscribirTorneo(torneo);
        equipo2.inscribirTorneo(torneo);
        equipo3.inscribirTorneo(torneo);
        equipo4.inscribirTorneo(torneo);
        equipo5.inscribirTorneo(torneo);
        equipo6.inscribirTorneo(torneo);

        torneo.realizarSorteo();
        torneo.jugarTorneo();
        torneo.clasificar();
        //torneo.verPuntos();




    }
}
