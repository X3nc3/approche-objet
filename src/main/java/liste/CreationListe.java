package liste;

import java.util.ArrayList;

public class CreationListe {

    public static void main(String[] args) {

        ArrayList<Integer> nombre = new ArrayList<>();

        for (int i=1; i<=100; i++) {
            nombre.add(i);
        }

        System.out.println(nombre.size());
    }
}
