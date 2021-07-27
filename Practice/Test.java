//Add from 1 to 1000, but skip every hundreds
public class Test {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 100 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
