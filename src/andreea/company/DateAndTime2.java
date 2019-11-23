package andreea.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime2 {
    //Write a Java program that checks if a date time read from console is
    // before or after current date time;
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");

        LocalDateTime acum = LocalDateTime.now();
        System.out.println("Acum este: "+ acum);

        System.out.println("Acum este,in alt format: "+acum.format(formatter));
        System.out.println("Acum, in formatul initial: "+ acum);

        System.out.println("Input date time: ");

        Scanner in = new Scanner(System.in);
        String dateInText = in.nextLine();

        System.out.println("Data citita ca text: " + dateInText);
        LocalDateTime timpCitit = LocalDateTime.parse(dateInText, formatter);

        System.out.println("Timpul citit este: " +timpCitit);
        System.out.println("Acum este: "+ LocalDateTime.now());
        acum = LocalDateTime.now();

        if(timpCitit.isBefore(acum)) {
            System.out.println("Timpul citit este mai vechi decat data si timpul actual");
        } else {
            System.out.println("Timpul citit este mai nou decat data si timpul actual");
        }


    }
}
