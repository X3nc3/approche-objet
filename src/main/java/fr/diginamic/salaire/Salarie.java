package fr.diginamic.salaire;

public class Salarie extends Intervenant{

    private final String status = "Salarie";
    private double salaireMensuel;

    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    };

    @Override
    public String afficherDonnees() {
        return "Nom :"+ getNom() +" Prenom :"+ getPrenom() +" Salaire :"+ getSalaire()+"€"+" Statut :"+ status ;
    };
}
