package liste;

public class TestEquals {
    public static void main(String[] args) {

        Ville ville1 = new Ville("Paris", 100_000);
        Ville ville2 = new Ville("Paris", 100_000);
        ville2 = ville1;

        System.out.println(ville1.equals(ville2));
        System.out.println(ville1 == ville2);

    }
}
