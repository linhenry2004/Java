public class CH03_06 {
    public static void main(String args[]) {
        int a, b;
        int x = 10, y = 20, z = 30;
        a = b = 5;
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
        System.out.printf("x *= a += y %%= b -= z *= 5\n");
        x *= a += y %= b -= z *= 5;
        System.out.printf("x = %d\n", x);
    }
}
