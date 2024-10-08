package fr.diginamic.entites;

public class Theatre {

    private String nom;
    private int capaciteMax;
    private int totalInscrits;
    private double totalRecette;

    public Theatre(String nom, int capaciteMax, int totalInscrits, double totalRecette) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalInscrits = totalInscrits;
        this.totalRecette = totalRecette;
    }

    public void inscrire(int nombClients, double prix) {
        if (totalInscrits + nombClients <= capaciteMax) {
            totalInscrits += nombClients;
            totalRecette += nombClients * prix;
        } else {
            System.out.println("il n'y a plus de place dans le theatre");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getTotalInscrits() {
        return totalInscrits;
    }

    public double getTotalRecette() {
        return totalRecette;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void setTotalInscrits(int totalInscrits) {
        this.totalInscrits = totalInscrits;
    }

    public void setTotalRecette(double totalRecette) {
        this.totalRecette = totalRecette;
    }
}
