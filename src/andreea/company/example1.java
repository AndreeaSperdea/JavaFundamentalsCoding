package andreea.company;

public class example1 {
    public static void main1(String[] args) {
        String str = "Ana are mere";
        String str2 = "Ana nu mai are mere";
        System.out.println("Texul este: " + str);
        System.out.println("Lungimea textului str este: " + str.length());
        System.out.println("Caracterul de pe pozitia 0 este: " + str.charAt(0));
        System.out.print("Str1 si str2 sunt egale?");
        String comparatie = str.compareTo(str2) != 0 ? " Sunt diferite" : "Sunt egale";
        System.out.println(comparatie);
        /* System.out.println(str.substring(str.indexOf("are"),2));
        System.out.println(str.substring(str.indexOf("mere"),str.indexOf("mere")+4));

        System.out.println(str.charAt(11));
        String st1 = "1234";
        String st2 = new String("1234");

        System.out.println(st1.compareTo(st2));
        /*
        int firstIndex = str.indexOf('e');
        int lastIndex = str.lastIndexOf('e');
        String subStr = str.substring(firstIndex+1, lastIndex-1);

        StringBuilder builder = new StringBuilder();
        builder.append("Ana ");
        builder.append("are ");
        builder.append("mere");

        System.out.println(builder);
        builder.replace(builder.indexOf("are"),builder.indexOf("are")+3, "mananca");
        System.out.println(builder);*/
    }

            public static void main(String[] args) {
                StringBuilder palindrom = new StringBuilder("rotator");
                System.out.println(palindrom);
                StringBuilder reversePalindrom = new StringBuilder(palindrom);
                palindrom.reverse();
                System.out.println(reversePalindrom);
                if (String.valueOf(palindrom).equalsIgnoreCase(String.valueOf(reversePalindrom))) {
                    System.out.println("Nu este palindrom " + palindrom + " " + reversePalindrom);
                }
            }











    }

