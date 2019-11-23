package andreea.company;

public class ex3 {
    public static void main(String[] args) {
        int[] array;
        array = initArray(100);
        printArray(array); }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    private static int[] initArray(int limit) {
        int[] array = new int[limit];
        int count = 0;
        for (int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
                array[count++] = i;
            }
        }return array;
    }
}
