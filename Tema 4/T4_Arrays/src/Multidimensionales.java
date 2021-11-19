public class Multidimensionales {
    public static void main(String[] args) {
        int [][] arrayMulti = new int[3][3];
        int [][] arrayMultiDiferente = {{1,2,3,4},{1,2,3},{4,5}};
        arrayMulti[0][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[1][2] = 6;

        for (int i = 0; i < arrayMultiDiferente.length; i++) {
            for (int j = 0; j < arrayMultiDiferente[i].length; j++) {
                System.out.print(arrayMultiDiferente [i][j] + " ");
            }
            System.out.println();
        }
    }
}
