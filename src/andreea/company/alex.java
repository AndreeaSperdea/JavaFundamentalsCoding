package andreea.company;

import java.util.Scanner;

public class alex {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dimensiune array: ");
            int dim = sc.nextInt();
            int count = 0;
            int[] arr = new int[dim];
            for (int i = 0; i < dim; i++) {
                System.out.print("array[" + (i + 1) + "]= ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Array initial este: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                //int[] arr = new int[]{1, 2, 3, 4, 5};
                //int n = 4;
                //int count = 0;
                //System.out.print("Array initial este: ");
                //for (int i = 0; i < arr.length; i++) {
                //System.out.print(arr[i] + " ");
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
        }
    }

