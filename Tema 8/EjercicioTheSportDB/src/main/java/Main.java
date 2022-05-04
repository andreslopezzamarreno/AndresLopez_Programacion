import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JSONController controller = new JSONController();
        int league;
        String country;
        int team;

        /*
        controller.readFirstfiveleagues();
        System.out.println("Que liga quieres consultar (id)");
        league = sc.nextInt();
        controller.showSeason(league);
         */

        System.out.println("De que pais quieres ver los equipos\nSpain, France, Italy, Portugal, England");
        // Spain, France, Italy, Portugal, England
        country = sc.next();
        controller.teams(country);

        System.out.println("Que equipo quieres consultar (id)");
        team = sc.nextInt();
        controller.consultTeam(team);


    }
}

