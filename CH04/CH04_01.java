public class CH04_01 {
	public static void main (String args [ ]) {
		java.util.Scanner input_obj = new java.util.Scanner(System.in);
		System.out.print(" 請輸入一個數字：");
		int num = input_obj.nextInt();
		
		if(num%2!=0)
			System.out.println(num + "為奇數");
		else
			System.out.println(num + "為偶數");
	}
}