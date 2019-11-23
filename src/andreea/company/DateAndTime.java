package andreea.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class DateAndTime {
    public static void main1(String[] args) {
        LocalDate acum = LocalDate.now();
        System.out.println(acum);

        System.out.println();

        LocalDateTime acumCuTimp = LocalDateTime.now();
        System.out.println(acumCuTimp);
        System.out.println();
        Instant chiarAcum = Instant.now();
        System.out.println(chiarAcum);
        System.out.println(Instant.EPOCH);
        System.out.println();
        ZonedDateTime acumCuFus = ZonedDateTime.now();
        System.out.println(acumCuFus);

    }

    public static void main5(String[] args) {
//Write a Java program to get day-in-week name for now date
        LocalDate astazi = LocalDate.now();
        DayOfWeek dayOfWeek = astazi.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    public static void main6(String[] args) {
        //Write a Java program to get the number of days of the current month
        LocalDate currentDay = LocalDate.now();
        Month lunaCurenta = currentDay.getMonth();
        System.out.println("Luna curenta este:" + lunaCurenta);
        System.out.println("Numarul de zile al lunii curente este: "+currentDay.getMonth().maxLength());
    }

    public static void main7(String[] args) {
        //Write a Java program to get the dates 10 days before and after today
        LocalDate astazi = LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;
        LocalDate acumUnAn;
        acumZeceZile = astazi.minus(10,DAYS);
        dupaZeceZile = astazi.plus(10,DAYS);
        acumUnAn = astazi.minus(1,YEARS);

        System.out.println("Astazi: " + astazi);
        System.out.println("Acum 10 zile: " + acumZeceZile);
        System.out.println("Dupa 10 zile: " + dupaZeceZile);
        System.out.println("Acum 1 an: " + acumUnAn);
        System.out.println("**************************");
        System.out.println("Acum 20 de zile: "+acumZeceZile.minusDays(10));
        System.out.println("Dupa 20 de zile: "+dupaZeceZile.plusDays(10));


    }

    public static void main8(String[] args) {
        //Write a java program to get the date and time after 2 weeks and 10 minutes

        LocalDateTime acum = LocalDateTime.now();
        System.out.println("Data si ora acum: "+ acum);

        LocalDateTime after = acum.plusWeeks(2).plusMinutes(10);
        System.out.println("Data si ora dupa 2 saptamani si 10 minute: "+after);
    }

    //    Write a Java program to get the months remaining in the year.
    public static void main9(String[] args) {
        LocalDate azi = LocalDate.now();
        int totalLuni = 12;
        int luniRamase = totalLuni - azi.getMonthValue();

        System.out.println("Luni ramase pana la finalul anului: " + luniRamase);
    }

    public static void main10(String[] args) {
//Write a Java program to show the date after reading years,
                // months and days from console
        Scanner in = new Scanner(System.in);

        System.out.println("Year: ");
        String year = in.nextLine();

        System.out.println("Month: ");
        String month = in.nextLine();

        System.out.println("Day: ");
        String day = in.nextLine();

        int yearInIntFormat = Integer.parseInt(year);
        int monthInIntFormat = Integer.parseInt(month);
        int dayInIntFormat = Integer.parseInt(day);

        LocalDate aDate = LocalDate.of(yearInIntFormat, monthInIntFormat, dayInIntFormat);

        System.out.println("Data introdusa este: "+ aDate);

    }
    /*Write a Java program to compute the diference
   between two dates (year, moths, days).
    */
    public static void main11(String[] args) {
        LocalDate firstDate = citesteDeLaTastatura();

        LocalDate secondDate = citesteDeLaTastatura();

        System.out.println(firstDate);
        System.out.println(secondDate);

        Period perioada1 = Period.between(firstDate, secondDate);
        System.out.println(perioada1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");
        System.out.println("Dati data: ");
        String input = in.nextLine();
        LocalDateTime form = LocalDateTime.parse(input,formatter);
        System.out.println(form);

        System.out.println(form.getHour());
        System.out.println("Ziua saptamanii: " +form.getDayOfWeek().getValue());
        System.out.println("Ziua saptamanii: " +form.getDayOfWeek());
    }
    public static LocalDate citesteDeLaTastatura() {
        System.out.println("Year: ");
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        System.out.println("Month: ");
        String month = in.nextLine();
        System.out.println("Day: ");
        String day = in.nextLine();
        int yearInIntFormat = Integer.parseInt(year);
        int monthInIntFormat = Integer.parseInt(month);
        int dayInIntFormat = Integer.parseInt(day);
        return LocalDate.of(yearInIntFormat, monthInIntFormat, dayInIntFormat);
    }
    }


