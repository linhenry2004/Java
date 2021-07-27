public class CH05_06 {
    public static void main(String args[]) {
        int a, b;
        for (a = 1; a <= 9; a++) {
            for (b = 1; b <= a; b++) {
                if (b == 8) {
                    continue;
                }
                System.out.printf("%d ", b);
            }
            System.out.printf("\n");
        }
    }
}
