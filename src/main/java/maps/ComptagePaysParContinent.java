package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        ArrayList<Pays> listPays = new ArrayList<>();
        listPays.add(new Pays("France", 65_000_000, "Europe"));
        listPays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        listPays.add(new Pays("Belgique", 10_000_000, "Europe"));
        listPays.add(new Pays("Russie", 150_000_000, "Asie"));
        listPays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        listPays.add(new Pays("Indonésie,", 220_000_000, "Océanie"));
        listPays.add(new Pays("Australie,", 20_000_000, "Océanie"));

        int europe = 0;
        int asie = 0;
        int oceanie = 0;

        for ( Pays pay : listPays) {
            if (pay.getContinent() == "Europe") {
                europe++;
            } else if (pay.getContinent() == "Asie") {
                asie++;
            } else if (pay.getContinent() == "Océanie") {
                oceanie++;
            }
        }

        HashMap<String, Integer> mapNbPaysParConti = new HashMap<>();
        mapNbPaysParConti.put("Europe", europe);
        mapNbPaysParConti.put("Asie", asie);
        mapNbPaysParConti.put("Océanie", oceanie);

        for (String continent : mapNbPaysParConti.keySet()) {
            System.out.println(mapNbPaysParConti.get(continent));
        }

    }
}
