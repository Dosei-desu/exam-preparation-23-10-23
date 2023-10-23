package øvelse4;

public class Tal {
    private int[] tilfældigeTal = new int[10];

    public int fåTal(){
        return (int)(Math.random()*5)+1;
    }

    public void lavMangeTal(){
        for (int i = 0; i < tilfældigeTal.length; i++) {
            tilfældigeTal[i] = (int)(Math.random()*5)+1;
        }
    }

    public String getTilfældigeTal() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < tilfældigeTal.length; i++) {
            string.append("Tal "+(i+1)+": "+tilfældigeTal[i]+"\n");
        }

        return string.toString().trim();
    }
}
