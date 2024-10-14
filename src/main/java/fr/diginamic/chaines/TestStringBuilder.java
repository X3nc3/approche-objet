package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        long debut = System.currentTimeMillis();
        for (int i=1; i<100_000; i++) {
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec StringBuilder : " + (fin - debut));

        String chiffre = "";

        long debut2 = System.currentTimeMillis();
        for (int i=1; i<100_000; i++) {
            chiffre += i;
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec + : " + (fin2 - debut2));
    }
}
