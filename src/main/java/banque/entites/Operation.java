package banque.entites;

public abstract class Operation {

    private String date;
    private int montant;

    public Operation(String date, int montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() +" "+ date +" "+ montant;
    }

    public String getDate() {
        return date;
    }

    public int getMontant() {
        return montant;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
