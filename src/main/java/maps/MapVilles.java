package maps;

import liste.Ville;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

    public static void main(String[] args) {

        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343_000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
        mapVilles.put("Lyon", new Ville("Lyon", 484_000));
        mapVilles.put("Foix", new Ville("Foix", 9_700));
        mapVilles.put("Pau", new Ville("Pau", 77_200));

        Ville villeNbHabitanMin = new Ville("", Integer.MAX_VALUE);

        for (String cle : mapVilles.keySet()) {
            if (mapVilles.get(cle).getNbHabitants() < villeNbHabitanMin.getNbHabitants()) {
                villeNbHabitanMin = mapVilles.get(cle);
            }
        }

        mapVilles.remove(villeNbHabitanMin.getNom());

        for (String cle : mapVilles.keySet()) {
            System.out.println(cle);
        }

    }
}
