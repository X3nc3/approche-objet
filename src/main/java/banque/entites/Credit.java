package banque.entites;

public class Credit extends Operation{

    public Credit(String date, int montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
     return "CREDIT";
    }

}
