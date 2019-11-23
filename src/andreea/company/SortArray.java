package andreea.company;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

        public static void main(String[] args) {
            Random rnd = new Random();
            int[] array = new int[]{
                    rnd.nextInt(9),
                    rnd.nextInt(7),
                    rnd.nextInt(6),
                    rnd.nextInt(3),
                    rnd.nextInt(915)
            };
            System.out.println(Arrays.toString(array));
           /* boolean sorted = false;
            while (!sorted) {
                sorted = true;
            }
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }*/

        Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            }

        }


