package andreea.company;

import java.util.Scanner;

public class switchExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indicate your direction [n, s, e, w]: ");
        String direction = input.nextLine();

        switch (direction) {
            case "n": {
                System.out.println("You are going North!");
            }
            break;
            case "s": {
                System.out.println("You are going South!");
            }
            break;
            case "e": {
                System.out.println("You are going East!");
            }
            break;
            case "w": {
                System.out.println("You are going West!");
            }
            break;
            default: {
                System.out.println("Bad direction!!!!!"); /*
                System.out.println("Indicate a new direction");
                direction = input.nextLine();
                switch (direction) {
                    case "n": {
                        System.out.println("You are going North!");
                    }
                    break;
                    case "s": {
                        System.out.println("You are going South!");
                    }
                    break;
                    case "e": {
                        System.out.println("You are going East!");
                    }
                    break;
                    case "w": {
                        System.out.println("You are going West!");
                    }
                    break;
                    default: {
                        System.out.println("Bad direction!!!!!");
                        System.out.println("Indicate a new direction");
                        direction = input.nextLine();

                    }
                }*/
            }
        }
    }
}


