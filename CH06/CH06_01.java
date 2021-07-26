public class CH06_01 {
	public static void main(String[] args) {
		int max;
		int[] intArray=new int[] {1, 6, 8, 9, 60, 72};
		max=intArray[0];
		System.out.println("原先陣列中所有元素的最大值：");
		for(int i=0;i<intArray.length;i++) {
			System.out.println("第" + (i+1) + "個元素為：" + intArray[i]);
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.println("陣列中所有雨素的最大值為：" + max);
	}
}
