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
        per1.adressePostale = adr1;

        Personne per2 = new Personne();
        per2.nom = "OGIER";
        per2.prenom = "Dominique";
        per2.adressePostale = new AdressePostale();
        per2.adressePostale.numeroDeRue = 32;
        per2.adressePostale.libelleDeRue = "Le val profond";
        per2.adressePostale.codePostal = 91570;
        per2.adressePostale.ville = "Bièvres";
        /*int numeroDeRue = 32;
        String libelleDeRue = "Le val profond";
        int codePostal = 91570;
        String ville = "Bièvres";*/

    }

}
