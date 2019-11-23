package andreea.company;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World\\!!!!!");
        int var1 = 20;
        double var2 = 40;
        System.out.println(var1 + " " + var2);
        System.out.println("*******");
        System.out.println("Valoarea minima pentru tipul Integer: " + Integer.MIN_VALUE);
        System.out.println("Valoarea maxima pentru tipul Integer: " + Integer.MAX_VALUE);

        System.out.println("Valoarea minima pentru tipul Long: " + Long.MIN_VALUE);
        System.out.println("Valoarea maxima pentru tipul Integer: " + Long.MAX_VALUE);

        System.out.println("Valoarea minima pentru tipul Double: " + Double.MIN_VALUE);
        System.out.println("Valoarea maxima pentru tipul Double: " + Double.MAX_VALUE);

        System.out.println("*******");

        int var3 = 6, var4 = 11;
        System.out.println("Sum of var3 and var4 is: " + (var3 + var4));
        System.out.println("*******");

        double var5 = 3.23523;
        System.out.printf("%.2f",var5);

    }

}

