package andreea.company;

import java.util.Scanner;
import java.util.Scanner;
public class ex12 {
    /*
    12. Create an application with a menu and with accepting parameters when starting.
        We are going to create a jar and run it with some arguments.
        Create a menu that will enable you to select the desired functionality
            and will stop when the read data is equal to a certain parameter out of the command line.
            E.g: the app will be customized to display the name of the user -u name -q "exit prog". Etc.
        **) Save the current time that you opened the app. You should have an option in the menu that prints the time spent in the app.
        a) Write a Java program to sum values of an array. Read the size and read the numbers
        b) Write a Java program to calculate the average value of array elements
        c) Write a Java program to remove a specific element from an array. Also change the size of the array
        d) Write a Java program to insert an element (specific position) into an array
        e) Write a Java program to find the second largest element in an array.
        f) Write a Java program to find the number of even and odd integers in a given array of integers
        g) Write a Java program to compute the average value of an array of integers except the largest and smallest values
        h) Write a Java program to cyclically rotate a given array clockwise by one
        i) Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
           ****
           * *
            *
        j) Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter. Create also another method that can print the rectangle and the diagonals.
        k) Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
        l)Read a sequence of numbers from the keyboard separated by ;. Print the new numbers as a difference between the sum of the others and the actual number
        m) Read a big number from the keyboard (let’ say 20 digits). Compute the division by a one digit number.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1.Write a Java program to sum values of an array. Read the size and read the numbers\n" +
                    "2.Write a Java program to calculate the average value of array elements\n" +
                    "3.Write a Java program to remove a specific element from an array. Also change the size of the array\n" +
                    "4.Write a Java program to insert an element (specific position) into an array\n" +
                    "5.Write a Java program to find the second largest element in an array.\n"+
                    "6.Write a Java program to find the number of even and odd integers in a given array of integers.\n\n" +
                    "0.Exit\n");
            System.out.println("Select an option: ");
            optiune = Integer.parseInt(scan.next());
            switch (optiune) {
                case 1:
                    Punct1(scan);
                    break;
                case 2:
                    Punct2(scan);
                    break;
                case 3:
                    Punct3(scan);
                    break;
                case 4:
                    Punct4(scan);
                    break;
                case 5:
                    Punctul5(scan);
                    break;
                case 6:
                    Punctul6(scan);
                case 0:
                    break;
                default:
                    System.out.println("Optiune incorecta");
                    System.out.println();
                    continue;
            }
        } while (optiune != 0);

    }
    public static void Punct1(Scanner scan) {
        //   1.Write a Java program to sum values of an array. Read the size and read the numbers
        System.out.print("Dimensiune array(pct1): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("1.Suma este: " + sumaArray(array));
        System.out.println();
    }
    public static void Punct2(Scanner scan) {
        //   2.Write a Java program to calculate the average value of array elements
        System.out.print("Dimensiune array(pct2): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        double avg = (double) sumaArray(array) / dim;
        System.out.printf("2.Average value: %.2f\n", avg);
        System.out.println();
    }
    public static void Punct3(Scanner scan) {
        //   3. Write a Java program to remove a specific element from an array. Also change the size of the array
        System.out.print("Dimensiune array(pct3): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Dimens initiala este: " + array.length);
        printArray(array);
        System.out.println();
        System.out.print("Dati indexul elementului: ");
        int index = scan.nextInt();
        array = extractPosition(array, index);
        System.out.println("Dimensiunea finala: " + array.length);
        printArray(array);
        System.out.println();
    }
    public static void Punct4(Scanner scan) {
        //   4.Write a Java program to insert an element (specific position) into an array
        System.out.print("Dimensiune array(pct4): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Dimens initiala este: " + array.length);
        printArray(array);
        System.out.println();
        System.out.print("Dati indexul elementului: ");
        int index = scan.nextInt();
        System.out.print("Dati valoarea: ");
        int value = scan.nextInt();
        array = addPosition(array, index, value);
        System.out.print("Dimensiunea finala: " + array.length);
        System.out.println();
        printArray(array);
        System.out.println();
    }
    public static void Punctul5(Scanner scan){
        // Write a Java program to find the second largest element in an array.
        System.out.println( "Dati dimensiune: " );
        int dim = scan.nextInt();
        int[] array = readArray( scan, dim );
        System.out.print("Al doilea maxim din array: ");
        System.out.println(largestNumber( extractElement( array,largestNumber( array ) )));
        // extrage cel mai mare el. din array...
        System.out.println();
    }
    public static void Punctul6(Scanner scan){
        System.out.println( "Dati dimensiune: " );
        int dim = scan.nextInt();
        int[] array = readArray( scan, dim );
        System.out.println("Numere Pare: "+ even(array));
        System.out.println("Numere Impare: "+ odd(array));
    }

    public static int[] readArray(Scanner scan, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + (i + 1) + "]= ");
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        System.out.print("array[]= ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int sumaArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public static int[] extractPosition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                continue;
            else {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }
    public static int[] addPosition(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[k] = value;
                k++;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }
    public static int largestNumber( int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if( array[i]>maxValue ){ //comparam elementele din array
                maxValue= array[i];
            }
        }
        return maxValue;
    }
    public static int[] extractElement(int[] array, int value) {
        int[] newArray = new int[array.length -1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] == value) {
                    continue;
                } else {
                    newArray[count] = array[i];
                    count++;
                }
            }
        }
        return newArray;
    }

    public static int even(int[] array){
        int countEven=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2 ==0)
                countEven++;
        }
        return countEven;
    }

    public static  int odd(int[] array){
        return array.length-even(array);
    }
}
