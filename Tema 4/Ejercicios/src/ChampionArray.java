public class ChampionArray {
    public static void main(String[] args) {

        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};
        int aleat;
        int aleat2;
        int[] nums1 = {-1, -1, -1, -1, -1, -1, -1, -1};
        int[] nums2 = {-1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < bombo1.length; i++) {

            aleat = (int) (Math.random() * 8);
            aleat2 = (int) (Math.random() * 8);

            do {

                if (nums1[aleat] == -1) {
                    nums1[aleat] = aleat;
                } else {
                    do {
                        aleat = (int) (Math.random() * 8);
                    } while (nums1[aleat]!= -1);
                }
            } while (nums1[aleat] == -1);


            do {

                if (nums2[aleat2] == -1) {
                    nums2[aleat2] = aleat2;

                } else {
                    do{
                        aleat2 = (int) (Math.random() * 8);
                    } while (nums2[aleat2] != -1);
                }
            } while (nums2[aleat2] == -1);


            System.out.print("*** Partido " + bombo1[aleat] + " - " + bombo2[aleat2] + " *** \n");
        }
    }
}
