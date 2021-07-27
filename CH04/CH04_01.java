public class CH04_01 {
    public static void main(String args[]) {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.print("Please input the spendings: ");
        int charge = input_obj.nextInt();

        if (charge >= 2000) {
            System.out.println("Wow you so rich");
        }
        input_obj.close();
    }
}
