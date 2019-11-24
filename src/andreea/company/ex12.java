package andreea.company;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        suma(in);
        average(in);
        punctul3(in);

    }

    public static void suma(Scanner in) {
        System.out.println("Dati lungimea array-ului: ");
        int dim = Integer.parseInt(in.nextLine());

        int[] array = readArray(in, dim);

        System.out.println("Suma este: " + sumArray(array));
    }

    public static void average(Scanner in) {
        System.out.println("Dati dimensiune: ");
        int dim = in.nextInt();
        int[] array = readArray(in, dim);
        double average = (double) sumArray(array) / dim;
        System.out.println("Media elementelor este: " + average);

    }

    public static void punctul3(Scanner in) {
        System.out.println("Dati dimensiune: ");
        int dim = in.nextInt();
        int[] array = readArray(in, dim);
        System.out.println("Dimensiunea initiala este: " + array.length);
        printArray(array);
        System.out.println("Dati indexul elementului:");
        int index = in.nextInt();
        array = extractPosition(array, index);
        System.out.println("Dimensiunea finala: " + array.length);
        printArray(array);

    }

    public static int[] readArray(Scanner in, int dimensiune) {

        int[] array = new int[dimensiune];

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + (i + 1) + "]=");
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static int[] extractPosition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            } else {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }
}



