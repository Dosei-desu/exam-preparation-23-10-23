package øvelse2;

import java.time.LocalDateTime;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film (String filmtitel, int udgivelsesår){
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film (String filmtitel){
        this.filmtitel = filmtitel;
        this.udgivelsesår = LocalDateTime.now().getYear(); //Calendar.getInstance().getWeekYear()
    }

    public void tilføjProducer(Producer producer){
        this.producer = producer;
    }

    public String toString(){
        if(producer == null){
            return "Navn: \""+filmtitel+"\"\n"+
                   "Udgivelsesår: "+udgivelsesår;
        }
        return "Navn: \""+filmtitel+"\"\n"+
                "Udgivelsesår: "+udgivelsesår+"\n"+
                "øvelse2.Producer: "+producer.getNavn();
    }
}
