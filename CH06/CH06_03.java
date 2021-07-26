public class CH06_03 {
	public static void main (String args []) {
		int[] num=new int[6];
		System.out.println("電腦幫你挑選樂透明牌：");
		for(int i = 0; i<num.length;i++) {
			num[i]=(int)(Math.random()*49+1);
			System.out.print(num[i]+" ");
		}
	}
}
