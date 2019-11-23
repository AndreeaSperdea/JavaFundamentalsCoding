package andreea.company;

public class ex1 {
    public static void main(String[] args) {
        int cat, rest;

        for (int i =1; i<=1000; i+=5){
           // int [] a = new int[i];
            cat = i;
            rest = 0;
            while(cat>=0) {
                cat = i / 10;
                rest = i % 10;}
                System.out.print(" " + cat);
                System.out.println("rest" + rest);
            }


        }
    }

