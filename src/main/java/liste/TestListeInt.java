package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println("Contenue de la liste :");
        for (int num : liste) {
            System.out.println(num);
        }

        System.out.println("");

        System.out.println("La taille de la liste est de : " + liste.size());

        System.out.println("");

        int maxNum = Integer.MIN_VALUE;
        for (int num : liste) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Le nombre le plus grand est : " + maxNum);

        System.out.println("");

        int minNum = Integer.MAX_VALUE;
        for (int num : liste) {
            if (num < minNum) {
                minNum = num;
            }
        }

        System.out.println("Nouvelle liste avec le plus petit nombre suprimé :");
        liste.remove(Integer.valueOf(minNum));
        for (int num : liste) {
            System.out.println(num);
        }

        System.out.println("");

        for (int i=0; i<liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, -liste.get(i));
            }
        }
        System.out.println("Nouvelle liste modifié : " + liste);


    }
}
