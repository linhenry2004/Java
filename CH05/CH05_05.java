public class CH05_05 {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            if (i == 79) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
