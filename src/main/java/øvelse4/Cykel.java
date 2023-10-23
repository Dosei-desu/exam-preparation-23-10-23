package øvelse4;

public class Cykel {
    private String mærke;
    private String farve;
    private int pris;

    public Cykel(String mærke, String farve, int pris) {
        this.mærke = mærke;
        this.farve = farve;
        this.pris = pris;
    }

    public String getMærke() {
        return mærke;
    }

    public String getFarve() {
        return farve;
    }

    public int getPris() {
        return pris;
    }
}
