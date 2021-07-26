import java.util.Scanner;

public class CH02_13 {
    public static void main(String args[]) {
        int c = 0;
        double f = 0;

        System.out.print("Please input degrees Celsius: ");
        Scanner input_obj = new Scanner(System.in);

        c = input_obj.nextInt();
        f = (double) c * 9 / 5 + 32;

        System.out.println(f);
    }
}
