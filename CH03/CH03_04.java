public class CH03_04 {
    public static void main(String args[]) {
        int a, b;
        a = 15;
        System.out.printf("a = %d \n", a);
        System.out.printf("b = ++a\n");
        b = ++a;
        System.out.printf("a = %d, b = %d\n", a, b);

        a = 15;
        System.out.printf("a = %d \n", a);
        System.out.printf("b = a++\n");
        b = a++;
        System.out.printf("a = %d, b = %d\n", a, b);

        a = 15;
        System.out.printf("a = %d \n", a);
        System.out.printf("b = --a\n");
        b = --a;
        System.out.printf("a = %d, b = %d\n", a, b);

        a = 15;
        System.out.printf("a = %d \n", a);
        System.out.printf("b = a--\n");
        b = a--;
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}