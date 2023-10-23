package øvelse3;

public class Terning {
    private int number = (int)(Math.random()*6)+1;

    public int getNumber() {
        return number;
    }

    public int ryst(){
        number = (int)(Math.random()*6)+1;
        return number;
    }
}
