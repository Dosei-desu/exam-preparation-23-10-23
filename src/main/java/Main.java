import øvelse1.Text;
import øvelse2.Film;
import øvelse2.Producer;
import øvelse3.Raflebæger;
import øvelse4.Tal1;
import øvelse5.Tal2;

public class Main {

    public static void main(String[] args) {
        //Øvelse 1 --- Tekst
        System.out.println("----------------------Tekst----------------------");

        Text text = new Text();
        text.add("John is john.");
        text.add("John is smith.");
        text.add("John is johnson.");
        text.add("John is smithson.");
        text.add("John is john.");
        text.add("Smith is john.");
        text.add("John is smithson.");

        System.out.println("List of lines (with duplicates)\n"+text.toString());
        System.out.println("Number of unique lines: "+text.findUniqueNumberOfLines());
        System.out.println("List of lines (only uniques)\n"+text.toStringUniques());

        //Øvelse 2 --- Film
        System.out.println("\n----------------------Film----------------------");

        Film film1 = new Film("John Bob");
        System.out.println(film1);
        Film film2 = new Film("The Tragedy of Daddy",1993);
        film2.tilføjProducer(new Producer("Smith Johnson"));
        System.out.println(film2);

        //Øvelse 3 --- Raflebæger
        System.out.println("\n----------------------Raflebæger----------------------");

        Raflebæger raflebæger = new Raflebæger(6);
        System.out.println("Sum af terninger: "+raflebæger.rystTerninger());
        System.out.println(raflebæger.seTerninger());
        System.out.println("Sum af terninger: "+raflebæger.rystTerninger());
        System.out.println(raflebæger.seTerninger());

        //Øvelse 4 --- Tal 1
        System.out.println("\n----------------------Tal 1----------------------");

        Tal1 tal1 = new Tal1();
        System.out.println("Tilfældig tal (1-5): "+tal1.fåTal());
        System.out.println("Tilfældig tal (1-5): "+tal1.fåTal());
        System.out.println("Tilfældig tal (1-5): "+tal1.fåTal());
        tal1.lavMangeTal();
        System.out.println(tal1.getTilfældigeTal());

        //Øvelse 5 --- Tal 2
        System.out.println("\n----------------------Tal 2----------------------");

        Tal2 tal2 = new Tal2();
        int num1 = 5;
        int num2 = 66;
        System.out.println("Forekomster af "+num1+": "+tal2.tælTal(num1));
        System.out.println("Forekomster af "+num2+": "+tal2.tælTal(num2));
        System.out.println("Gennemsnit af alle tal: "+tal2.gennemsnit());
    }
}
