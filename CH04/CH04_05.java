public class CH04_05 {
    public static void main(String args[]) {
        java.util.Scanner input_obj = new java.util.Scanner(System.in);

        int select;
        System.out.print("(1) Pork\n");
        System.out.print("(2) Seafood\n");
        System.out.print("(3) Chicken\n");
        System.out.print("(4) Fish\n");
        System.out.print("\nInput a number: ");
        select = input_obj.nextInt();
        System.out.print("\n===========================\n");

        switch (select) {
            case 1:
                System.out.print("$75");
                break;
            case 2:
                System.out.print("$85");
                break;
            case 3:
                System.out.print("$80");
                break;
            case 4:
                System.out.print("$60");
                break;
            default:
                System.out.print("WTF");
        }
        System.out.print("\n===========================\n");
        input_obj.close();
    }
}
