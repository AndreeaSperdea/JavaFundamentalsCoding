package ro.sdaacademy.javafundamentals.arrayExercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import ro.sdaacademy.javafundamentals.varargs.VarArgsUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("m: ");
        int m = Integer.parseInt(in.nextLine());
        System.out.println("Dati n: ");
        int n = Integer.parseInt(in.nextLine());
        int[][] array = new int[m][n];
        System.out.println("Input values");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("array[" + i + "]" + "[" + j + "]=");
                array[i][j] = Integer.parseInt(in.nextLine());
            }
            sum+= VarArgsUtils.getSum(array[i]);

        }
        System.out.println("Suma este: " + sum);


    }


    /*
     * read from keyboard the array dimensions m and n
     *
     * create and int array of dimension[m,n]
     *
     * read from keyboard all values in the array
     *
     * calculate
     *  1. min value
     *  2. max value
     *  3. sum of all values using VarArgsUrtils.getSum method
     *  4. calculate average value
     */
}
