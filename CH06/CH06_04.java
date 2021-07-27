public class CH06_04 {
    public static void main(String args[]) {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        int[][] arr = new int[2][2];
        int sum;

        System.out.printf("|a1 b1|\n");
        System.out.printf("|a2 b2|\n");

        System.out.printf("Please insert a1: ");
        arr[0][0] = input_obj.nextInt();
        System.out.printf("Please insert b1: ");
        arr[0][1] = input_obj.nextInt();
        System.out.printf("Please insert a2: ");
        arr[1][0] = input_obj.nextInt();
        System.out.printf("Please insert b2");
        arr[1][1] = input_obj.nextInt();

        sum = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        System.out.printf("|%d %d|\n", arr[0][0], arr[0][1]);
        System.out.printf("|%d %d|\n", arr[1][0], arr[1][1]);
        System.out.printf("sum = %d\n", sum);
        input_obj.close();
    }
}
