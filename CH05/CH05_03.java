public class CH05_03 {
	public static void main (String args [ ]) {
		int x=1, sum=100;
		
		while(sum>=0) {
			sum=sum-x;
			x++;
		}
		System.out.printf("x=%d\n", x-1);
	}
}
