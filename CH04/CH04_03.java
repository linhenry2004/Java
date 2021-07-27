public class CH04_03 {
    public static void main(String args[]) {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.println("Please input your spending: ");
        double cost = input_obj.nextDouble();
        if (cost >= 150000) {
            System.out.println("Wow you rich boi");
        } else if (cost >= 50000) {
            System.out.println("Noice rich man");
        } else {
            System.out.println("HA poor kid");
        }
        input_obj.close();
    }
}
