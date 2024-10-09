package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {

    public static void main(String[] args) {

        ArrayList<Ville> listeVille = new ArrayList<>();
        listeVille.add(new Ville("Nice", 343_000));
        listeVille.add(new Ville("Carcassonne", 47_800));
        listeVille.add(new Ville("Lyon", 484_000));
        listeVille.add(new Ville("Foix", 9_700));
        listeVille.add(new Ville("Pau", 77_200));
        listeVille.add(new Ville("Marseille", 850_700));
        listeVille.add(new Ville("Tarbes", 40_600));

        Ville VilleMax = new Ville("", Integer.MIN_VALUE);
        Ville villeMIn = new Ville("", Integer.MAX_VALUE);

        for (Ville ville : listeVille) {
            if (ville.getNbHabitants() > VilleMax.getNbHabitants()) {
                VilleMax = ville;
            } else if (ville.getNbHabitants() < villeMIn.getNbHabitants()) {
                villeMIn = ville;
            }
            if (ville.getNbHabitants() > 100_000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        listeVille.remove(villeMIn);

        System.out.println("La ville avec plus d'habitant est  : " + VilleMax.getNom());
        System.out.println("La ville avec plus d'habitant est  : " + villeMIn.getNom());
        System.out.println(listeVille);

    }
}
