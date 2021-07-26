public class CH06_02 {
	public static void main (String args []) {
		int i, j, tmp;
		int data[] = {26, 35, 49, 37, 12, 8, 45, 63};
		System.out.printf("氣泡排序法 \n原始資料為：");
		for (i=0;i<8;i++)
			System.out.printf("%3d", data[i]);
		System.out.printf("\n");
		
		for (i=7;i>0;i--) {
			for (j=0;j<i;j++) {
				if(data[j]>data[j+1]) {
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		System.out.printf("排序後的結果為：");
		for(i=0;i<8;i++)
			System.out.printf("%3d", data[i]);
		System.out.printf("\n");
	}
}
