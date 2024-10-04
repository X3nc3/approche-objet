package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(1, "allée des rosseaux", 91430, "Vauhallan");

        Personne per1 = new Personne("OGIER", "Maxence", adr1);

        Personne per2 = new Personne("OGIER", "Dominique", new AdressePostale(32, "Le val profond", 91570, "Bièvres"));

    }

}
