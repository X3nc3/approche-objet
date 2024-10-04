package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroDeRue = 1;
        adr1.codePostal = 91430;
        adr1.libelleDeRue = "allée des rosseaux";
        adr1.ville = "Vauhallan";;

        Personne per1 = new Personne();
        per1.nom = "OGIER";
        per1.prenom = "Maxence";
        per1.adresse = adr1;

        Personne per2 = new Personne();
        per2.nom = "OGIER";
        per2.prenom = "Dominique";
        per2.adresse = new AdressePostale();
        per2.adresse.numeroDeRue = 32;
        per2.adresse.libelleDeRue = "Le val profond";
        per2.adresse.codePostal = 91570;
        per2.adresse.ville = "Bièvres";

    }

}
