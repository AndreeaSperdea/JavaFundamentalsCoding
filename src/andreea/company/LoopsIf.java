package andreea.company;

import java.util.Scanner;

public class LoopsIf {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);    //citire de la tastatura
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        int x = Integer.parseInt(ss);   //citeste un intreg

        if (x < 10) {
            System.out.println(x + " este mai mic decat 10");
        }
        else {
            if (x <= 20 && x <= 30) {
                System.out.println(x + " este mai mic decat 30");
            }
            else {
                System.out.println( x + "este mai mare decat 30");
            }


        }
    }
}




