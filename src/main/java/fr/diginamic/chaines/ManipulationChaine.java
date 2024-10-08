package fr.diginamic.chaines;

import fr.diginamic.entites.Salaire;

import java.util.Arrays;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Duran;Marcel;2 523.5";

        int longChaine = chaine.length();
        System.out.println("La longueur de la chaine est de :" + longChaine);

        int indexDu1er = chaine.indexOf(';');
        System.out.println("L'index du premier ';' est :" + indexDu1er);

        String nomDeFamille = chaine.substring(0 ,chaine.indexOf(';'));
        System.out.println(nomDeFamille.toUpperCase());
        System.out.println(nomDeFamille.toLowerCase());

        String[] chaineDecoupe = chaine.split(";");
        System.out.println(Arrays.toString(chaineDecoupe));

        String salaireModif = chaineDecoupe[2].replace(" ", "");

        Double Salaire = Double.parseDouble(salaireModif);

        Salaire salaire1 = new Salaire(chaineDecoupe[0], chaineDecoupe[1], Salaire);

    }
}
