package ro.andreea.ownstudy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaFundamentals1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dati numarul de linii:");

        int m = Integer.parseInt(input.nextLine());

        System.out.println("Dati numarul de coloane:");

        int n = Integer.parseInt(input.nextLine());

        int[][] array1 = new int[m][n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Introduceti elementele array-ului: ");
                array1[i][j] = Integer.parseInt(input.nextLine());
                sum += array1[i][j];
                if (array1[i][j] <min){
                    min = array1[i][j];
                }
                if (array1[i][j]>max){
                    max = array1[i][j];
                }
            }
        }
        for (int i=0; i<m;i++) {
            for (int j=0; j<n;j++) {
                System.out.print(array1[i][j]+ " ");
                if(j==(n-1))
                    System.out.println();
            }
        }
        System.out.println("Valoarea minima este:"+min);
        System.out.println("Valoarea maxima este:"+max);
        System.out.println("Suma tuturor elementelor este: "+sum);
    }
}
