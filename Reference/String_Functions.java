public class String_Functions {
    public static void main(String args[]) {
        String string1 = new String("Google");
        String string2 = new String("Linux");
        String string3 = new String("Google Android");
        String string4;
        int n;

        System.out.println("string1 is " + string1);
        System.out.println("string2 is " + string2);
        System.out.println();

        n = string1.compareTo(string2);

        if (n < 0) {
            System.out.println(string1 + " is less than " + string2);
        } else if (n == 0) {
            System.out.println(string1 + " is equal to " + string2);
        } else {
            System.out.println(string1 + " is greater than " + string2);
        }

        System.out.printf("\nT%s has %d characters\n", string1, string1.length());
        System.out.printf("\nT%s has %d characters\n", string2, string2.length());

        string1 = string1.concat(" Map!");
        System.out.printf("\nAfter concatenation,\n");
        System.out.printf("string1 is %s\n", string1);
        System.out.printf("The length of %s is %d\n\n", string1, string1.length());

        string4 = string3.substring(7, 14);
        System.out.printf("string4 = %s\n", string4);
    }
}
