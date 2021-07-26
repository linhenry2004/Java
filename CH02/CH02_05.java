package CH02;
import java.io.*;

public class CH02_05 {
	private static char myData;
	public static void main(String args []) throws IOException
	{
		System.out.print("請輸入字串：");
		myData = (char)System.in.read();
		System.out.println("輸入的資料為：" + myData);
	}
}