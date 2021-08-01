public class Find_Max {
    public static void main(String args[]) {
        int i, j, index = 0, max;
        int numbers[] = { 10, 5, 15, 20, 100, 30, 40, 60, 70 };

        max = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        for (j = 0; j < numbers.length; j++) {
            System.out.printf("%5d", numbers[j]);
        }
        System.out.printf("\n\n");
        System.out.printf("Maximum: %d, index: %d", max, index + 1);
    }
}
