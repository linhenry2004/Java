public class CH02_02 {
	final static double C1 = 1024.0;
	final static double C2 = 1048576.0;

	public static void main(String args[]) {
		int a = 800;
		double b, c;
		b = a * C1;
		c = a * C2;
		System.out.println("原印碟容量=" + a + " Gigabytes");
		System.out.println("原印碟容量=" + b + " Megabytes");
		System.out.println("原印碟容量=" + c + " Kilobytes");
	}
}
