package liste;

import java.util.Objects;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public int compareTo(Ville autre) {
        /*return this.nom.compareTo(autre.getNom());*/
        if (this.nbHabitants < autre.nbHabitants) {
            return -1;
        } else if (this.nbHabitants > autre.nbHabitants) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville)) {
            return false;
        }
        Ville autre = (Ville) o;
        return nom.equals(autre.nom) && nbHabitants == autre.getNbHabitants();

    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
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
