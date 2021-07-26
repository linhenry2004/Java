package CH02;
import java.io.*;

public class CH02_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入一個完整的英文句子：");
		String text = buf.readLine();
		System.out.println("您輸入的英文句子：" + text);
	}
}