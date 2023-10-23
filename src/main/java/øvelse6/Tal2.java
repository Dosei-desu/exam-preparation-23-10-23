package øvelse6;

import java.util.ArrayList;
import java.util.Arrays;

public class Tal2 {
    private ArrayList<Integer> talListe = new ArrayList<>(
            Arrays.asList(5,66,12,87,66,56,89,66));

    public int tælTal(int number){
        int count = 0;
        for (int num: talListe) {
            if(num == number){
                count++;
            }
        }
        return count;
    }

    public double gennemsnit(){
        int sum = 0;

        for (int num: talListe) {
            sum += num;
        }

        return (double)sum/talListe.size();
    }
}
