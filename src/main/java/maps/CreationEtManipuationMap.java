package maps;

import java.util.HashMap;

public class CreationEtManipuationMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lile");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        for (int cle : mapVilles.keySet()) {
            System.out.println(cle);
        }

        for (String valeur : mapVilles.values()) {
            System.out.println(valeur);
        }

        System.out.println(mapVilles.size());
    }
}
