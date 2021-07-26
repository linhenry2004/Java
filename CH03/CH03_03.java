public class CH03_03 {
    public static void main(String args[]) {
        int a = 3, b = 5, c = 7;

        System.out.printf("a = %d b = %d c = %d\n", a, b, c);
        System.out.printf("================================\n");
        System.out.println("a < b && b < c || c < b = " + (a < b && b < c || c < b));
        System.out.println("!(a==b) && (!(a < b)) = " + (!(a == b) && (!(a < b))));
    }
}
