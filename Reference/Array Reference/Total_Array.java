import java.util.Scanner;

public class Total_Array {
    public static void main(String args[]) {
        int score[] = new int[6];
        int total = 0, i;
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 6; i++) {
            System.out.printf("Enter score[%d] = ", i);
            score[i] = input.nextInt();
            total = total + score[i];
        }

        System.out.printf("\nThe total of [");
        for (i = 0; i < 6; i++) {
            System.out.printf("%d", score[i]);
            if (i < 5) {
                System.out.printf(", ");
            }
        }
        System.out.printf("] is %d\n", total);
        input.close();
    }
}