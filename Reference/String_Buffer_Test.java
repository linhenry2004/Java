public class String_Buffer_Test {
    public static void main(String args[]) {
        StringBuffer str1 = new StringBuffer();
        System.out.printf("Length of str1 is %d\n", str1.length());
        System.out.printf("Capacity of str1 is %d\n\n", str1.capacity());

        StringBuffer str2 = new StringBuffer("Apple iphone");
        System.out.printf("Length of str2 is %d\n", str1.length());
        System.out.printf("Capacity of str2 is %d\n\n", str1.capacity());

        str2.insert(0, "I like the ");
        System.out.printf("str2=%s\n", str2);
        System.out.printf("Length of str2 is %d\n", str1.length());
        System.out.printf("Capacity of str2 is %d\n\n", str1.capacity());

        str2.append(" and iMac. ");
        System.out.printf("str2=%s\n", str2);
        System.out.printf("Length of str2 is %d\n", str1.length());
        System.out.printf("Capacity of str2 is %d\n\n", str1.capacity());

        StringBuffer str3 = new StringBuffer(60);
        System.out.printf("Capacity of str3 is %d\n\n", str1.capacity());
    }
}
