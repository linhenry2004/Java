package CH02;
import java.io.*;

public class CH02_06 {
	public static void main(String args[]) throws IOException
	{
		java.util.Scanner input_obj=new java.util.Scanner(System.in);
		
		System.out.print("請從鍵盤輸入字串資料型態：");
		String StrVal = input_obj.nextLine();
		System.out.println("您所輸入的字串值為 " + StrVal);
		
		System.out.println("請從鍵盤輸入整數資料型態：");
		int IntVal = input_obj.nextInt();
		System.out.println("您所輸入的整數值為 " + IntVal);
		
		System.out.print("請從鍵盤輸入浮點數資料型態：");
		double DoubleVal = input_obj.nextDouble();
		System.out.println("您所輸入的浮點數值為 " + DoubleVal);
	}
}