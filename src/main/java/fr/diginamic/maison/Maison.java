package fr.diginamic.maison;

import java.util.Arrays;
import java.util.Objects;

public class Maison {

    public Piece[] maison = new Piece[0];

    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            System.out.println("La piece n'existe pas !");
        } else if (piece.getSuperficie() < 0) {
            System.out.println("La piece doit avoir une superficie plus grande que 0m² !");
        } else if (piece.getEtage() < 0) {
            System.out.println("La piece doit avoir un etage superieur ou égale à 0 !");
        } else  {
            maison = Arrays.copyOf(maison, maison.length+1);
            maison[maison.length-1] = piece;
        }
    }

    public double superficietotal() {
        double superficieTotal = 0;
        for (int i=0; i< maison.length; i++) {
            superficieTotal += maison[i].getSuperficie();
        }
        return superficieTotal;
    }

    public double superficieEtage(int numEtage) {
        double superficieEtage = 0;
        for (int i=0; i< maison.length; i++) {
            if (maison[i].getEtage() == numEtage) {
                superficieEtage += maison[i].getSuperficie();
            }
        }
        return superficieEtage;
    }

    public double superficiePiece(String type) {
        double superficiePiece = 0;
        for (int i=0; i< maison.length; i++) {
            if (maison[i].type().equals(type)) {
                superficiePiece += maison[i].getSuperficie();
            }
        }
        return superficiePiece;
    }

    public int nombPiece(String type) {
        int nombrePiece = 0;
        for (int i=0; i< maison.length; i++) {
            if (maison[i].type().equals(type)) {
                nombrePiece ++;
            }
        }
        return nombrePiece;
    }

}
