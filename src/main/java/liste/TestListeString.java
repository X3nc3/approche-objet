package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

public class TestListeString {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste, "Nice", "Carcassonne", "Narbonne", "Lyon", "Pau", "Marseille", "Tarbes");

        String villeMax = "";
        for (String ville : liste) {
            if (ville.length() > villeMax.length()) {
                villeMax = ville;
            }
        }
        System.out.println("La ville avec le plus de caractere est : " + villeMax);

        System.out.println("");

        for (int i=0; i<liste.size(); i++) {
            liste.set(i, liste.get(i).toUpperCase());
            System.out.println(liste.get(i));
        }

        System.out.println("");

        Iterator<String> iter = liste.iterator();
        while (iter.hasNext()) {
            String ville = iter.next();
            if (ville.charAt(0) == 'N') {
                iter.remove();
            }
        }

        for (String ville : liste) {
            System.out.println(ville);
        }

    }
}
