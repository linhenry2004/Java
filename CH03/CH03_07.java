public class CH03_07 {
    public static void main(String args[]) {
        char chr_pass;

        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.print("Please input your math score: ");
        int math = input_obj.nextInt();
        System.out.print("Please input your science score: ");
        int science = input_obj.nextInt();

        System.out.printf("Math = %d, Science = %d\n", math, science);
        chr_pass = ((math >= 60) && (science >= 60)) ? 'Y' : 'N';
        System.out.printf("Pass? %c\n", chr_pass);
    }
}
