package andreea.company;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dati primul numar: ");
        int m = Integer.parseInt(in.nextLine());
        System.out.println("Dati al doilea numar: ");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Numerel sunt: " + m + " " + n);
        while (n < 0 || m < 0) {
            System.out.println("Dati primul numar: ");
            m = Integer.parseInt(in.nextLine());
            System.out.println("Dati al doilea numar: ");
            n = Integer.parseInt(in.nextLine());

        }

        numere(m, n);
    }



    private static void numere(int m, int n) {

        for(int i=1; i<=n; i=i+m)
            System.out.println(i);
    }


}
