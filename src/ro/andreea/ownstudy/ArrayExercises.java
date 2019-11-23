package ro.andreea.ownstudy;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        int arrayOfInts [] = new int[] {2,4,6,8,10,12,14};
        String arrayOfStrings [] = new String [] {"Andreea","Madalina", "Sperdea"};

        Scanner input = new Scanner (System.in);


        System.out.println("Dati lungimea array-ului: ");
        int length = Integer.parseInt(input.nextLine());

        String a[] = new String[length];
    int sum=0;
        for (int i = 0; i<length; i++){
            System.out.println("Dati elementul "+(i+1)+": ");
            a[i] =input.nextLine();


        }
        for(int k =0; k<length;k++) {
            System.out.println("a["+k+"]="+a[k]);
        }

//afisare cu enhanced for si calcularea sumei
       for(String i:a){
         System.out.println(i);
         sum+=Integer.parseInt(i);
        }
        System.out.println("Suma tuturor elementelor este: "+sum);

    }
}
