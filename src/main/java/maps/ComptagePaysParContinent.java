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

        HashMap<String, Integer> mapNbPaysParConti = new HashMap<>();

        for ( Pays pay : listPays) {
            String continent = pay.getContinent();
            mapNbPaysParConti.put(continent, mapNbPaysParConti.getOrDefault(continent, 0)+1);
        }

        for (String continent : mapNbPaysParConti.keySet()) {
            System.out.println(continent + ":" + mapNbPaysParConti.get(continent));
        }

    }
}
