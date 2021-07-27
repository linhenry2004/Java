public class CH03_05 {
    public static void main(String args[]) {
        int a = 12;

        System.out.printf("%d&38=%d\n", a, a & 38);
        System.out.printf("%d|38=%d\n", a, a | 38);
        System.out.printf("%d^38=%d\n", a, a ^ 38);
        System.out.printf("~%d=%d\n", a, ~a);
        System.out.printf("%d<<2=%d\n", a, a << 2);
        System.out.printf("%d>>2=%d\n", a, a >> 2);
    }
}
