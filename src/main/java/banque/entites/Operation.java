package banque.entites;

public abstract class Operation {

    protected String date;
    protected int montant;

    public Operation(String date, int montant) {
        this.date = date;
        this.montant = montant;
    }

    public String toString() {
        return date +" "+ montant;
    }

    public abstract String getType();

}
