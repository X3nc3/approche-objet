package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        CalculMoyenne test1 = new CalculMoyenne();
        test1.ajout(10);
        test1.ajout(20);
        test1.ajout(30);
        System.out.println(test1.calcul());

        CalculMoyenne test2 = new CalculMoyenne();
        test2.ajout(40);
        test2.ajout(50);
        test2.ajout(60);
        System.out.println(test2.calcul());

    }
}
