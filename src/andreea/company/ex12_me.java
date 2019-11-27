package andreea.company;

import java.util.Scanner;

public class ex12_me {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1.Write a Java program to sum values of an array. Read the size and read the numbers");
            System.out.println("2. Write a Java program to cyclically rotate a given array clockwise by one");
            System.out.println("3. Write a Java program to calculate the average value of array elements");
            System.out.println("4. Write a Java program to remove a specific element from an array. Also change the size of the array");
            System.out.println("0. Exit\n");
            System.out.println("Select an option: ");
            optiune = in.nextInt();
            switch (optiune) {
                case 1:
                    punctulA(in);
                    System.out.println();
                    break;
                case 2:
                    punctulH(in);
                    System.out.println();
                    break;
                case 3: punctulB(in);
                    System.out.println();
                    break;
                case 4: punctulC(in);
                case 0:
                    break;
                default:
                    System.out.println("Wrong option!!!Please insert a valid option");
                    continue;
            }
        } while (optiune != 0);
    }

    public static void punctulA(Scanner in) {
        //   1.Write a Java program to sum values of an array. Read the size and read the numbers
        System.out.println("Give the dimension of the array: ");
        int dimension = in.nextInt();
        int[] array = readArray(dimension, in);
        printArray(dimension, array);
        System.out.println("The sum of array's elements is: " + sumOfElements(array));
    }

    public static void punctulB(Scanner in) {
        //Write a Java program to calculate the average value of array elements
        System.out.println("Give the dimension of the array: ");
        int dimension = in.nextInt();
        int[] array = readArray(dimension, in);
        printArray(dimension, array);
        double avg = averageValue(sumOfElements(array), dimension);
        System.out.printf("Average value is: %.2f",avg);
        System.out.println();
    }

    public static void punctulC(Scanner in){
        System.out.println("Give the dimension of the array:");
        int dim = in.nextInt();
        int[] array = readArray(dim,in);
        printArray(dim,array);
        System.out.println("Dimension of the initial array is: "+ dim);
        System.out.println("Input the index of the element you want to extract: ");
        int x = in.nextInt();
        int[] b = extractArray(array,x);
        printArray(b.length, b);
        System.out.println("The new dimension of the array is: " + b.length);
    }

    public static void punctulH(Scanner in) {

        System.out.println("Give the dimension of the array: ");
        int dimension = in.nextInt();
        int[] array = readArray(dimension, in);
        printArray(dimension, array);
        System.out.println("Shiffted array: ");
        printArray(dimension, rotateArray(array));
    }

    public static int[] readArray(int dim, Scanner in) {
        int[] array = new int[dim];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]=");
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void printArray(int dim, int[] array) {
        System.out.print("( ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + " , ");
            else
                System.out.print(array[i] + " ");
        }
        System.out.print(")\n");
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double averageValue(int sum, int dimension) {
        return (double) sum / dimension;
    }

    public static int[] extractArray( int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                continue;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    public static int[] rotateArray(int[] array) {
        int[] newArray = new int[array.length];
        int k = 1;
        newArray[0] = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    /*public static void Alex(Scanner in) {

        System.out.print("Dimensiune array: ");
        int dim = in.nextInt();
        int count = 0;
        int[] arr = new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.print("array[" + (i + 1) + "]= ");
            arr[i] = in.nextInt();
        }
        System.out.print("Array initial este: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");

        }
        while (count < dim) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            count++;
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }*/
}
