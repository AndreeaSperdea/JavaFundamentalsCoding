package andreea.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class IfStatementExercises {
    public static void main1(String[] args) {

        ///exercise 1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String ss = in.nextLine();
        System.out.println("You entered string: "+ ss);
        int age = Integer.parseInt(ss);

        if( age <18){
            System.out.println("You are a teenager");
        }
        else if(age>100){
            System.out.println("You are too old!!!");
        }
        else{
        System.out.println("You are an adult!!!");}
    }


    public static void main(String[] args) {
        //exercise 2
        Scanner input = new Scanner(System.in);
        System.out.println("Dati un numar de la 0 la 5: ");
        String x = input.nextLine();
        int transToInt = Integer.parseInt(x);


        if((transToInt < 0)|| (transToInt >5)){
            System.out.println("Invalid input!!!!!!Please enter a value from 0 to 5.");
            System.out.println("Enter a new value:");
            x = input.nextLine();
            transToInt = Integer.parseInt(x);
            if (transToInt == 0){
                System.out.println(")");
            }
            else if(transToInt ==1){
                System.out.println("!");
            } else if(transToInt ==2){
                System.out.println("\"");
            } else if(transToInt==3){
                System.out.println("£");
            }else if(transToInt == 4){
                System.out.println("$");

            }else {
                System.out.println("%");
            }
            }
        else{
            if (transToInt == 0){
                System.out.println(")");
            }
            else if(transToInt ==1){
                System.out.println("!");
            } else if(transToInt ==2){
                System.out.println("\"");
            } else if(transToInt==3){
                System.out.println("£");
            }else if(transToInt == 4){
                System.out.println("$");

            }else if(transToInt ==5){
                System.out.println("%");
            }

        }
        }
    }



