package fr.diginamic.jdr;

public class Personnage {

    private int force;
    private int pointsDeVie;
    private int score = 0;

    public Personnage(int force, int pointsDeVie, int score) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
