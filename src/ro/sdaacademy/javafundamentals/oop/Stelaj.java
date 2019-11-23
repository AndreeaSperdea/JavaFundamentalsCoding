package ro.sdaacademy.javafundamentals.oop;

public class Stelaj{
    private Raft [] rafturi = new Raft[]{
            new Raft(),
            new Raft(),
           // new Raft(),
        //new Raft()

    }; //stelajul are 4 rafturi

    public void afisare() {
        for (int i = 0; i < rafturi.length; i++) {
         System.out.println("Rafturi" + i);
            rafturi[i].afisare();
        }
    }
    public boolean isEmpty(){
        boolean empty = true;
        for( Raft raft:rafturi) {
            empty = empty && raft.isEmpty();}
        return empty;
    }

    public boolean adaugare(ObiectDinCamara obiect) {
        for(Raft raft : rafturi) {
            //if(!raft.isFull())
            if(raft.adauga(obiect))
                return true;
        }
        return false;
    }
}

