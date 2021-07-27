public class CH03_08 {
    public static void main(String args[]) {
        int a, b, c;
        a = 12;
        b = 30;
        c = a * 19 + (b + 7 % 2) - 20 * 7 % (b % 7) - ++a;
        System.out.printf("a = %d b = %d \n", a, b);
        System.out.printf("Results: %d\n", c);
    }
}
