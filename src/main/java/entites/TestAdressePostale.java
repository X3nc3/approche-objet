package entites;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroDeRue = 1;
        adr1.codePostal = 91430;
        adr1.libelleDeRue = "allée des rosseaux";
        adr1.ville = "Vauhallan";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroDeRue = 32;
        adr2.libelleDeRue = "Le val profond";
        adr2.codePostal = 91570;
        adr2.ville = "Bièvres";

    }

}
