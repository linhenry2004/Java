import java.io.*;

public class CH02_11 {
    private static char myData;

    public static void main(String args[]) throws IOException {
        System.out.print("Please input a string: ");
        myData = (char) System.in.read();
        System.out.println("Input data: " + myData);
    }
}
