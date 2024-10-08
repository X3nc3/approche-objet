package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    private final String status = "Pigiste";
    private int nombJourTravaille;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int nombJourTravaille, double montantJournalier) {
        super(nom, prenom);
        this.nombJourTravaille = nombJourTravaille;
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return nombJourTravaille * montantJournalier;
    };

    @Override
    public String afficherDonnees() {
        return "Nom :"+ getNom() +" Prenom :"+ getPrenom() +" Salaire :"+ getSalaire()+"€"+" Statut :"+ status ;
    };
}
