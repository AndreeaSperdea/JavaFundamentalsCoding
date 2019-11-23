package andreea.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println(("Dati a: "));
        int a = Integer.parseInt(in.nextLine());
        System.out.println("Dati b: ");
        int b = Integer.parseInt(in.nextLine());
        System.out.println("a= "+a+" b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Valori inversate: a= "+a+" b="+b);

    }
}
