public class ChampionArray {
    public static void main(String[] args) {

        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool" };
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid" };
        int aleat;
        int aleat2;
        int [] nums1= {0,0,0,0,0,0,0,0};
        int [] nums2= {0,0,0,0,0,0,0,0};
        int vari = -1;
        int vari2= -1;

        for (int i = 0; i < bombo1.length; i++) {

            aleat = (int) (Math.random() * 8);
            aleat2 = (int) (Math.random() * 8);

            do {
                //for (int j = 0; j < nums1.length; j++) {
                    if (nums1[aleat] == 0) {
                        nums1[aleat] = aleat;
                    } else {
                        aleat = (int) (Math.random() * 8);
                    }
                //}
            } while (nums1[aleat] == 0);


            do {
                //for (int j = 0; j < nums2.length; j++) {

                    if (nums2[aleat2] == 0) {
                        nums2[aleat2] = aleat2;
                    } else {
                        aleat2 = (int) (Math.random() * 8);
                    }
                //}
            } while (nums2[aleat2]==0);


            System.out.print("*** Partido " + bombo1[aleat] + " - " + bombo2[aleat2] + " *** \n");
        }
    }
}
