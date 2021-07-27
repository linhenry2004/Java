public class CH05_04 {
    public static void main(String args[]) {
        int n;
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.printf("Please input an integer: ");
        n = input_obj.nextInt();
        System.out.printf("Output: ");
        do {
            System.out.printf("%d", n % 10);
            n = n / 10;
        } while (n != 0);

        System.out.printf("\n");
        input_obj.close();
    }
}
