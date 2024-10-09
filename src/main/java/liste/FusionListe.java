package liste;

import java.util.ArrayList;

public class FusionListe {

    public static void main(String[] args) {
        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();
        for (String color : liste1) {
            liste3.add(color);
        }
        for (String color : liste2) {
            liste3.add(color);
        }

    }
}
