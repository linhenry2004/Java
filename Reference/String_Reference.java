public class String_Reference {
    public static void main(String args[]) {
        String string1 = new String("Apple iPod");
        String string2 = new String("Apple iTouch");
        String string3 = new String("Apple iPod");

        System.out.println("String1: " + string1);
        System.out.println("String2: " + string2);
        System.out.println("String3: " + string3 + "\n");

        System.out.println("Address: ");
        if (string1 == string2) {
            System.out.printf("String1 is equal to String2\n");
        } else {
            System.out.printf("String1 is not equal to String2\n");
        }

        System.out.println("Content: ");
        if (string1.equals(string2)) {
            System.out.printf("String1 is equal to String2\n");
        } else {
            System.out.printf("String1 is not equal to String2\n");
        }

        System.out.printf("\n");

        System.out.println("Address: ");
        if (string1 == string3) {
            System.out.printf("String1 is equal to String3\n");
        } else {
            System.out.printf("String1 is not equal to String3\n");
        }

        System.out.println("Content: ");
        if (string1.equals(string3)) {
            System.out.printf("String1 is equal to String3\n");
        } else {
            System.out.printf("String1 is not equal to String3\n");
        }
    }
}
