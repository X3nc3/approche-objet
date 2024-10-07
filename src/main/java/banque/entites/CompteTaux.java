package banque.entites;

public class CompteTaux extends Compte{

    private double taux;

    public CompteTaux(int numeroCompte, double soldeCompte, double taux) {
        super (numeroCompte, soldeCompte);
        this.taux = taux;

    }

    @Override
    public String toString() {
        return super.toString() +" Le taux du compte est :"+ taux+"%";
    }

}
