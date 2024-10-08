package fr.diginamic.maison;

public abstract class Piece {

    private double superficie;
    private int numEtage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.numEtage = etage;
    }

    public abstract String type();

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return numEtage;
    }

}
