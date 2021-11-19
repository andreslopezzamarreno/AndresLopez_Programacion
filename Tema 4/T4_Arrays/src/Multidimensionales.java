public class Multidimensionales {
    public static void main(String[] args) {
        int [][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[1][2] = 6;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti.length; j++) {
                System.out.print(arrayMulti [i][j]);
            }
            System.out.print(" \n");
        }
    }
}
