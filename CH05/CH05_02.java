public class CH05_02 {
	public static void main (String args []) {
		int i, j;
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.printf("%d*%d=", i, j);
				System.out.printf("%d\t" , i*j);
			}
		System.out.printf("\n");
		}
	}
}
