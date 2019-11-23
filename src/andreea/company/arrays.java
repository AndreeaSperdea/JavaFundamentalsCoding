package andreea.company;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[5];

        Scanner in = new Scanner(System.in);  //pentru citirea de pe consola

        for ( int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print("arrayOfStrings[" + i + "]=");

            arrayOfStrings[i] = in.nextLine();  //citeste array-ul

            System.out.println(" -- ");
        }
        /**
         * using enhanced for write the array
         * format : (x,x,x,x,x)
         */
        System.out.print("(");
        for(String ss : arrayOfStrings) {
            if (ss == (arrayOfStrings[4])) {
                System.out.print(ss);
            }
            else {
                System.out.print(ss + ",");
            }
        }
        System.out.print(")");
    }
}



