package andreea.company;

public class forExercises {
    public static void main(String[] args) {
        /*
        //1. print your name 5 times

        for (int i = 1; i<=5;i++){
            System.out.println(i+ ".Andreea Sperdea");
        }
        System.out.println("****************");
        for(int j=5; j>=1; j--){
            System.out.println(j+ ".Andreea Sperdea");
        }
        System.out.println("**************************");
        int sum = 0;
        for (int count = 10; count<=30; count ++){
            sum += count;
        }
        System.out.println("Total sum of the indexes from 10 to 30 is: "+sum);
        System.out.println("*********************************"); */
        l1:
       for(int k=0; k<=3; k++) {
           l2:
           for (int l=0; l<=3; l++){
               if(k==2){
                   break l2;
               }
               System.out.println("a["+k+"]"+"["+l+"]");
           }
       }
        System.out.println("**********************");
       l3:
        for(int k=0; k<=3; k++) {
            l4:
            for (int l=0; l<3; l++){

                if(k==2){
                    break l4;
                }
                System.out.println("a["+k+"]"+"["+l+"]");
            }
        }
    }
}
