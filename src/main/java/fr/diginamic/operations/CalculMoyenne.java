package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    public double[] tab = new double[1];

    public void ajout(double a) {
        tab = Arrays.copyOf(tab, tab.length+1);
        tab[tab.length-2] = a;
    }

    public double calcul() {
        double somme = 0;
        for (int i=0; i< tab.length; i++) {
            somme += tab[i];
        }
        return somme / (tab.length-1);
    }

}
