package andreea.company;

import java.util.Scanner;

public class LoopsSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);    //citire de la tastatura
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        switch (ss.charAt(0)) {
            case '1':
            case '5':
            case '3':
                System.out.println("Male");
                break;
            case '2':
            case '4':
                System.out.println("Female");
                break;

            default:
                System.out.println("Undefined");
        }

        }
    }
