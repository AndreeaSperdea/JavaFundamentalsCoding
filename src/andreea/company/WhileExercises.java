package andreea.company;

import java.util.Scanner;

public class WhileExercises {
    public static void main1(String[] args) {
        String name = "Andreea";
        int i =1;
        while (i <= 5) {
            System.out.println(name+ " scris de " + i + " ori");
            i++;
        }
    }

    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dati textul [write x to stop]: ");
        String text = input.nextLine();
        while (!text.equalsIgnoreCase("x")){
            System.out.println("Textul introdus: "+text);
            System.out.println("Dati textul: ");
            text = input.nextLine();

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dati textul: ");
        String text1 = input.nextLine();

        while(!text1.contains("stop")){
           // System.out.println("Textul introdus este:" +text1);
            System.out.println("Scrieti alt text:");
            String text2 = input.nextLine();
            text1 = text1.concat(text2);
            System.out.println("textul final: "+ text1);
        }

    }
}
