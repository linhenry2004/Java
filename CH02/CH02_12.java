import java.io.*;

public class CH02_12 {
    public static void main(String args[]) throws IOException {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);

        System.out.print("Input a string: ");
        String StrVal = input_obj.nextLine();
        System.out.println("Your input string is " + StrVal);

        System.out.print("Please input an integer: ");
        int IntVal = input_obj.nextInt();
        System.out.println("Your input integer is " + IntVal);

        System.out.print("Please input a floating point: ");
        double DoubleVal = input_obj.nextDouble();
        System.out.println("Your input floating point is " + DoubleVal);
    }
}
