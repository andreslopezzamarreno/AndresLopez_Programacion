import java.util.ArrayList;

public class ChampionArray {
    public static void main(String[] args) {

        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool" };
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid" };
        int aleat;
        int aleat2;
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int i = 0; i < bombo1.length; i++) {

            aleat = (int) (Math.random() * 8);
            do {

                if (!nums1.contains(aleat)) {
                    nums1.add(aleat);
                } else {
                    aleat = (int) (Math.random() * 8);

                }
            } while (nums1.contains(aleat));

            aleat2 = (int) (Math.random() * 8);
            do {

                if (!nums2.contains(aleat2)) {
                    nums2.add(aleat2);
                } else {
                    aleat2 = (int) (Math.random() * 8);
                }
            } while (nums2.contains(aleat2));

            System.out.print("*** Partido " + bombo1[aleat] + " - " + bombo2[aleat2] + " *** \n");
        }

    }
}
