public class CH06_05 {
    public static void main(String args[]) {
        int[][][] A = new int[][][] { { { 1, 2 }, { 5, 6 } }, { { 3, 4 }, { 7, 8 } } };
        int i, j, k;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    System.out.printf("A[%d][%d][%d] = %d\n", i, j, k, A[i][j][k]);
                }
            }
        }
    }
}
