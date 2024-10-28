package fr.diginamic.jdr;

public class Creature {

    private String nom;
    private int force;
    private int pointsDeVie;
    private int points;

    public Creature(String nom, int force, int pointsDeVie, int points) {
        this.nom = nom;
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.points = points;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
