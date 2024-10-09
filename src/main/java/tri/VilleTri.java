package tri;

import liste.Ville;
import java.util.ArrayList;
import java.util.Collections;

public class VilleTri {

    public static void main(String[] args) {

        ArrayList<Ville> listeVille = new ArrayList<>();
        listeVille.add(new Ville("Nice", 343_000));
        listeVille.add(new Ville("Carcassonne", 47_800));
        listeVille.add(new Ville("Lyon", 484_000));
        listeVille.add(new Ville("Foix", 9_700));
        listeVille.add(new Ville("Pau", 77_200));
        listeVille.add(new Ville("Marseille", 850_700));
        listeVille.add(new Ville("Tarbes", 40_600));

        Collections.sort(listeVille);
        System.out.println(listeVille);
    }

}
