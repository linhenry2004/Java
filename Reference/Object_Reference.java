public class Object_Reference {
    int x = 100;
    int y = 200;

    public static void change(Object_Reference obj1) {
        int temp;
        temp = obj1.x;
        obj1.x = obj1.y;
        obj1.y = temp;
    }

    public static void main(String args[]) {
        Object_Reference obj = new Object_Reference();

        System.out.printf("Before: \n");
        System.out.printf("x = %d\n", obj.x);
        System.out.printf("y = %d\n", obj.y);
        obj.change(obj);
        System.out.printf("After: \n");
        System.out.printf("x = %d\n", obj.x);
        System.out.printf("y = %d\n", obj.y);
    }
}