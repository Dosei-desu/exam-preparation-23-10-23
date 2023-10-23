package øvelse3;

public class Raflebæger {
    private Terning[] terninger;
    private final int SIDER_På_TERNING = 6;

    public Raflebæger(int antalTerninger){
        terninger = new Terning[antalTerninger];
        for (int i = 0; i < terninger.length; i++) {
            terninger[i] = new Terning();
        }
    }

    public int rystTerninger(){
        int sumAfTerninger = 0;
        for (Terning terning: terninger) {
            sumAfTerninger += terning.ryst();
        }
        return sumAfTerninger;
    }

    public String seTerninger(){
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < terninger.length; i++) {
            string.append("Terning "+(i+1)+": "+terninger[i].getNumber()+"\n");
        }

        return string.toString().trim();
    }

}
