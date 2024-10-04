package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(1, "allée des rosseaux", 91430, "Vauhallan");
        AdressePostale adr2 = new AdressePostale(32, "Le val profond", 91570, "Bièvres");


        Personne per1 = new Personne("Ogier", "Maxence", adr1);

        Personne per2 = new Personne("Ogier", "Dominique", new AdressePostale(32, "Le val profond", 91570, "Bièvres"));

        per1.affNomPren();
        per1.setNom("Sclafert");
        per1.setPren("Adeline");
        String nouveauNom = per1.getNom();
        System.out.println(per1.nom);
        String nouveauPrenom = per1.getPrenom();
        System.out.println(per1.prenom);
        per1.setAdressePostale(adr2);
        AdressePostale nouvelleAdresse = per1.getAdresse();
        System.out.println(per1.adresse.ville);

    }

}
