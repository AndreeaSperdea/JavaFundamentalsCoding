package ro.sdaacademy.javafundamentals.oop;

import java.util.Scanner;

public class ManagerCamara {
    private static Camara camara = new Camara(2);

    public static void main(String[] args) {
        Borcan borcan = new Borcan();
        borcan.setContinut("Castraveti");

        Sticla sticla = new Sticla();
        sticla.setContinut("Sirop de mure");

        Borcan borcan1 = new Borcan();
        borcan1.setContinut("Castraveti1");

        Sticla sticla1 = new Sticla();
        sticla1.setContinut("Sirop de mure1");

       Borcan borcan2 = new Borcan();
       borcan2.setContinut("Castraveti2");

     Sticla sticla2 = new Sticla();
     sticla2.setContinut("Sirop de mure2");

         camara.adauga(borcan);
        camara.adauga(sticla);
        camara.adauga(borcan1);
        camara.adauga(sticla1);
       camara.adauga(borcan2);
        camara.adauga(sticla2);

        Scanner in = new Scanner(System.in);
        String opt;
        do{
            System.out.println("1.Afisare Camara");
            System.out.println("2. Adauga");
            System.out.println("3. Extrage");
            System.out.println("4.EXIT");

            System.out.println("Opt: ");
            opt = in.nextLine();

            switch (opt){
                case "1": afisareCamara();
                    break;

                default:
                    System.out.println("Optiune invalida!!!!!");
            }

        } while(!"4".equalsIgnoreCase(opt));


    }
    private static void afisareCamara(){
        System.out.println("Camara e goala?" + camara.isEmpty());
        camara.afisare();

    }
}
