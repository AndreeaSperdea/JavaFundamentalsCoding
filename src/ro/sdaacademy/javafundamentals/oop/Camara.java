package ro.sdaacademy.javafundamentals.oop;

public class Camara {
    private Stelaj [] stelaje;                              //definire variabila de tip array cu obiecte de tip stelaj - declarare

    public Camara(int nrStelaje) {                              //pt a instantia clasa Camara prin constructor
        stelaje = new Stelaj[nrStelaje];   //instantiere  -creaza un array gol si se rezerva spatiul
        for(int i =0; i<nrStelaje;i++){
            stelaje[i]= new Stelaj();         //initializare - se pun stelajele clasice
        }
    }

    public void afisare() {
        System.out.println("Afisare camara");
        for(int i=0; i<stelaje.length;i++){
           System.out.println("Stelaj"+i);
            stelaje[i].afisare();
        }
    }
    public boolean isEmpty(){
        boolean empty = true;
        for(Stelaj stelaj:stelaje)
            empty = empty && stelaj.isEmpty();
            return empty;
        }
    public boolean adauga(Borcan borcan) {
        for(Stelaj st : stelaje) {
            // if(!st.isFull())
            if(st.adaugare(borcan))
                return true;
        }
        return false;
    }

    public boolean adauga(Sticla sticla) {
        for(Stelaj st : stelaje) {
            // if(!st.isFull())
            if(st.adaugare(sticla))
                return true;
        }
        return false;
    }


}

    /*
    public static void main(String[] args) {
        Borcan borcan1 = new Borcan("Castraveti");


        System.out.println(borcan1.totalBorcane);

        System.out.println(borcan1.getContinut());

        Borcan borcan2 = new Borcan("Castraveti");
        System.out.println(borcan2.totalBorcane);
        System.out.println(borcan1.totalBorcane);
        System.out.println(Borcan.totalBorcane--);
        System.out.println(borcan2.totalBorcane);





       //System.out.println(borcan1.equals(borcan2));

    }*/

