public class CH03_01 {
    public static void main(String args[]) {
        int hundred, thousand;
        int ten;
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input_obj.nextInt();

        thousand = (num / 1000) % 10;
        hundred = (num / 100) % 10;
        ten = (num / 10) % 10;
        System.out.println(num);
        System.out.println(thousand);
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(num % 10);
    }
}
