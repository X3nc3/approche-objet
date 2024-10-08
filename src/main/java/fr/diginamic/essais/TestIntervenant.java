package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {

        Salarie salarier1 = new Salarie("Ogier", "Maxence", 1800);
        System.out.println(salarier1.afficherDonnees());

        Pigiste salarier2 = new Pigiste("Sclafert", "Adeline", 5, 75);
        System.out.println(salarier2.afficherDonnees());

    }
}
