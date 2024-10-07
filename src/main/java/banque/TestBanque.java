package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        Compte compte1 = new Compte(123456, 15.56);
        CompteTaux compte2 = new CompteTaux(654321, 15000.56, 1.5);

        Compte[] arrayCompte = {compte1, compte2};

        for (int i=0; i<arrayCompte.length; i++) {
            System.out.println(arrayCompte[i]);
        }

    }
}
