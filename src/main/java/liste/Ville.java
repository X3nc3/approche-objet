package liste;

public class Ville {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
