package liste;

import java.util.ArrayList;
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

        int nbHabitantLePlusGrand = Integer.MIN_VALUE;
        String VilleAvecLePlusHabitants = "";
        for (Ville ville : listeVille) {
            if (ville.getNbHabitants() > nbHabitantLePlusGrand) {
                nbHabitantLePlusGrand = ville.getNbHabitants();
                VilleAvecLePlusHabitants = ville.getNom();
            }
        }
        System.out.println("La ville la plus peuplé est : " + VilleAvecLePlusHabitants);

        System.out.println("");

        int nbHabitantLePlusPetit= Integer.MAX_VALUE;
        Ville VilleAvecLeMoinsHabitants = null;
        for (Ville ville : listeVille) {
            if (ville.getNbHabitants() < nbHabitantLePlusPetit) {
                nbHabitantLePlusPetit = ville.getNbHabitants();
                VilleAvecLeMoinsHabitants = ville;
            }
        }
        listeVille.remove(VilleAvecLeMoinsHabitants);

        for (Ville ville : listeVille) {
            System.out.println("La liste modifié avec la ville la moins peuple en moins :" + ville);
        }

        System.out.println("");

        for (int i=0; i<listeVille.size(); i++) {
            if (listeVille.get(i).getNbHabitants() > 100_000) {
                listeVille.get(i).setNom(listeVille.get(i).getNom().toUpperCase());
            }
        }

        for (Ville ville : listeVille) {
            System.out.println("La liste modifié avec les ville de plus de 100 000 habiatnt en gras :" + ville);
        }
    }
}
