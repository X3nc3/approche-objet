package banque;

import banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {

        Compte compte1 = new Compte(123456, 15.56);

        System.out.println(compte1);

    }
}
