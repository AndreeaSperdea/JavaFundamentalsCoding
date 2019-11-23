package ro.teme;

import java.util.Scanner;

public class Tema02 {
    /*Write a Java program to reverse an array of integer values
            ( array-ul in consideram unimensionam in[] array)

     */
    public static void main1(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dati lungimea sirului: ");
        int length = Integer.parseInt(input.nextLine());

        int [] array = new int[length];
        for(int i=length-1; i>=0; i--){
            System.out.println("Dati elementele sirului: ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        for (int i:array){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dati lungimea sirului: ");
        int length = Integer.parseInt(input.nextLine());

        int [] array = new int[length];
        int[] reverse = new int[length];

        for(int i=0; i<length; i++){
            System.out.println("Dati elementele sirului: ");
            array[i] = Integer.parseInt(input.nextLine());
            reverse[length-1-i]=array[i];

        }
        for (int i:array){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Rversed array:");
        for (int i:reverse){
            System.out.print(i+ " ");
        }

    }

    }

