public class CH04_04 {
    public static void main(String args[]) {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        int degree, pay;

        System.out.println("Input degrees: ");
        degree = input_obj.nextInt();
        if (degree >= 1 && degree <= 100) {
            pay = 10 * degree;
        } else if (degree >= 101 && degree <= 200) {
            pay = (int) (12.5 * degree);
        } else if (degree >= 201 && degree <= 300) {
            pay = 18 * degree;
        } else {
            pay = 22 * degree;
        }
        System.out.println(pay);
        input_obj.close();
    }
}
