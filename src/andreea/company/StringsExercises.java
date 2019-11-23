package andreea.company;

public class StringsExercises {
    public static void main(String[] args) {
        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(s1);

        System.out.println("Converted to lower case: \""+ s1.toLowerCase() +"\"");     //converts the text in a lower case text

        System.out.println("Converted to upper case: \""+s1.toUpperCase()+"\"");   //converts the text in a lower case text

        System.out.println("Replace all \" o\" with \"z: "+s1.replace('o','z'));

        System.out.println("Does the text ends with \" elit \"? "+ s1.endsWith("elit"));
        System.out.println("******************");
        String a = "abc";
        String b = "abc";
        String c = new String ("abc");
        System.out.println(a == b); //output should be: true
        System.out.println(a.equals(b));  //output should be: true
        System.out.println(b==c); //output should be: false
        System.out.println(b.equals(c)); //output should be: true
        System.out.println("********************************************");
        //exercise with StringBuilder

        StringBuilder s = new StringBuilder("Initial StringBuilder-ul contine doar atat.");
        System.out.println(s);
        System.out.println("***********************");
        s.append(" Am adaugat ceva in sir.");
        System.out.println("Acum StringBuilder, s contine: "+s);

       // System.out.println(" s reversed: " + s.reverse());

        StringBuilder s2 = new StringBuilder(s.reverse());
        System.out.println("Sirul s2 contine: " +s2);

        System.out.println("Acum StringBuilder, s contine: "+s);

        StringBuilder s3 = s.reverse();
        System.out.println("Sirul s3 contine: "+s3);

        System.out.println("Acum StringBuilder, s contine: "+s);

    }
}
