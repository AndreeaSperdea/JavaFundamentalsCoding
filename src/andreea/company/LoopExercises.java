package andreea.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class LoopExercises {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your text [quit - to exit]: ");
        String text = in.nextLine();
        while (!text.contains("quit")) {
            while (text.equalsIgnoreCase("continue")) {
                System.out.println("Write your text [ quit - to exit]: ");
                text = in.nextLine();
            }
                System.out.println("Your text: " + text);
                System.out.println("Write your text [ quit - to exit]: ");
                text = in.nextLine();


        }
    }

    public static void main(String[] args) {
        //Draw rectangle from stars
        Scanner in = new Scanner(System.in);

        System.out.println("Input the high of the rectangle:");
        int h = in.nextInt();
        System.out.println("Input the width of the rectangle");
        int w= in.nextInt();
        for (int raw =1; raw<=h;raw++)
            for(int column = 1;column<=w;column++)
            {
                System.out.print("*");
                if(column == w){
                    System.out.println();
                }
            }
        System.out.println("---------------------------------------");

        //Draw rectangle from stars (only edges)
        for (int raw = 1; raw <= h; raw++)
            if(raw == 1 || raw ==h){
            for (int column = 1; column <= w; column++){
                System.out.print("*");
                    if (column == w) {
                        System.out.println();

                }

                        }
                    }
        else{
                for (int column = 1; column <= w; column++){
                    if(column==1) {
                        System.out.print("*");
                    }else if(column==w){
                        System.out.print("*");
                        System.out.println();
                    }
                    else{System.out.print(" ");}

                        }

                    }

                    }

                }
















