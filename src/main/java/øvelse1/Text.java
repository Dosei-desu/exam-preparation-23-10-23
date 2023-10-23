import java.util.ArrayList;
import java.util.Collections;

public class Text {
    private ArrayList<String> textLines;

    public Text(){
        textLines = new ArrayList<>();
    }

    public void add(String string){
        textLines.add(string);
    }

    public int findUniqueNumberOfLines(){
        int number = 0;
        Collections.sort(textLines);
        for (int i = 0; i < textLines.size(); i++) {
            if(i == 0){
                number++;
            }else{
                if (!textLines.get(i).equals(textLines.get(i-1))){
                    number++;
                }
            }
        }

        return number;
    }

    public String toString(){
        Collections.sort(textLines);
        String text = "";
        for (String string: textLines) {
            text += string + "\n";
        }
        return text.trim();
    }

    public String toStringUniques(){
        Collections.sort(textLines);
        String text = "";
        for (int i = 0; i < textLines.size(); i++) {
            if(i == 0){
                text += textLines.get(i) + "\n";
            }else{
                if (!textLines.get(i).equals(textLines.get(i-1))){
                    text += textLines.get(i) + "\n";
                }
            }
        }

        return text;
    }
}
