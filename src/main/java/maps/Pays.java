package maps;

public class Pays {

    private String nom;
    private int nombreHabitants;
    private String continent;

    public Pays(String nom, int nombreHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public String getContinent() {
        return continent;
    }
}
