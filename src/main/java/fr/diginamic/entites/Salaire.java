package fr.diginamic.entites;

public class Salaire {

    protected String nom;
    protected String prenom;
    protected Double salaire;

    public Salaire(String nom, String prenom, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
}
