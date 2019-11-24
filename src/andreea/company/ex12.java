package andreea.company;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        suma();

    }
    public static void suma()
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Dati lungimea array-ului: ");
        int dim = Integer.parseInt(in.nextLine());

        int [] array = new int[dim];
int sum = 0;
        for (int i = 0; i < dim ; i++) {
            System.out.println("array["+(i+1)+"]=" );
            array[i] = Integer.parseInt(in.nextLine());
            sum = sum+array[i];
        }
        System.out.println("Suma este: "+sum);
    }

}
