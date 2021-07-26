package CH02;
import java.util.Scanner;

public class CH02_08 {
	public static void main(String args []) {
		int c = 0;
		double f = 0;
		
		System.out.print("請輸入攝氏溫度：");
		Scanner input_obj = new Scanner(System.in);
		
		c = input_obj.nextInt();
		f = (double) c * 9 / 5 + 32;
		
		System.out.print( f );
	}
}
