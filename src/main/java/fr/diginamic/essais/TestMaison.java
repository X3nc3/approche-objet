package fr.diginamic.essais;

import fr.diginamic.maison.*;


public class TestMaison {

    public static void main(String[] args) {

        Maison maison1 = new Maison();
        maison1.ajouterPiece(new Salon(30, 0));
        maison1.ajouterPiece(new Cuisine(10, 0));
        maison1.ajouterPiece(new WC(3, 0));
        maison1.ajouterPiece(new SalleDeBain(10, 1));
        maison1.ajouterPiece(new Chambre(10, 1));
        maison1.ajouterPiece(new Chambre(10, 1));
        maison1.ajouterPiece(new Chambre(10, 1));
        maison1.ajouterPiece(new Chambre(-10, 0));
        maison1.ajouterPiece(new Chambre(10, -1));
        maison1.ajouterPiece(null);
        System.out.println("La superficie total est :" + maison1.superficietotal());
        System.out.println("La superficie de l'etage choisis est :" + maison1.superficieEtage(0));
        System.out.println("La superficie de l'etage choisis est :" + maison1.superficieEtage(1));
        System.out.println("La superficie des pieces choisis est :" + maison1.superficiePiece("Chambre"));
        System.out.println("Le nombre de piece choisis est : " + maison1.nombPiece("Chambre"));


    }
}
