package fichier;

public class Ville {

    private String nom;
    private String codePostal;
    private String nomRegion;
    private int population;

    public Ville(String nom, String codePostal, String nomRegion, int population) {
        this.nom = nom;
        this.codePostal = codePostal;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", population=" + population +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
