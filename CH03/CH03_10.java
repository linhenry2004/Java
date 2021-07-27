import java.io.*;

public class CH03_10 {
    public static void main(String args[]) throws IOException {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        float total, ave;

        System.out.print("Input Student Name: ");
        int no = input_obj.nextInt();
        System.out.println("Input Chinese English Math score: ");
        System.out.print("Chinese: ");
        int Chi = input_obj.nextInt();
        System.out.print("English: ");
        int Eng = input_obj.nextInt();
        System.out.print("Math: ");
        int Math = input_obj.nextInt();
        total = Chi + Eng + Math;
        ave = total / 3;

        System.out.println("**************************************");
        System.out.printf("Name: %d\n", no);
        System.out.println("Chinese \t Engish \t Math \t Total \t Average \t");
        System.out.printf("%d\t%d\t%d\t%.0f\t%.1f\t \n", Chi, Eng, Math, total, ave);
        System.out.println("**************************************");
    }
}
