package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre theatre1 = new Theatre("Theatre1", 200, 0, 0);
        theatre1.inscrire(150, 20.25);
        System.out.println("Le nombre d'inscrit est :" + theatre1.getTotalInscrits());
        System.out.println("La recette totale est :" + theatre1.getTotalRecette());
        theatre1.inscrire(50, 20.25);
        System.out.println("Le nombre d'inscrit est :" + theatre1.getTotalInscrits());
        System.out.println("La recette totale est :" + theatre1.getTotalRecette());
        theatre1.inscrire(10, 20.25);

    }

}
