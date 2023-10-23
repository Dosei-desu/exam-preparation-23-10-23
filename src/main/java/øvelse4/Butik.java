package øvelse4;

import java.util.ArrayList;

public class Butik {
    private ArrayList<Cykel> cykelListe = new ArrayList<>();

    public void tilføj(Cykel cykel){
        cykelListe.add(cykel);
    }

    public int samletLagerBeholding(){
        int sum = 0;
        for (Cykel cykel: cykelListe) {
            sum += cykel.getPris();
        }
        return sum;
    }
}
