import java.util.Scanner;

public class Test_String {
    public static void main(String args[]) {
        char ch[] = { 'I', ' ', 'l', 'o', 'v', 'e' };
        System.out.print(ch);
        String ch2 = "iPod";
        System.out.printf(" %s\n", ch2);

        String str[] = new String[2];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.printf("Please input #%d string: ", i + 1);
            str[i] = keyboard.nextLine();
        }

        for (int j = 0; j < str.length; j++) {
            System.out.println(str[j]);
        }
        keyboard.close();
    }
}
