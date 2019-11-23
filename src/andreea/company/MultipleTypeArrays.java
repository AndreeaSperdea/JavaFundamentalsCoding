package andreea.company;

public class MultipleTypeArrays {
    public static void main(String[] args) {
        Object[] arrayOfObjects = new Object[3];
        arrayOfObjects[0] = 1;
        arrayOfObjects[1] = 2.7456d;
        arrayOfObjects[2] = "ana are mere";
        for (Object o : arrayOfObjects) {
            System.out.println(o);

        }
        /* if int print hexa
                * if double print 3 decimals
                * else print as string */

        for(Object o2 : arrayOfObjects){
            if(o2 instanceof Integer) {
                System.out.printf("%08x%n", o2);
            }else if (o2 instanceof Double) {
                System.out.printf("%.3f%n", o2);
            }else{
                System.out.println(o2);
            }
        }

    }

    }

