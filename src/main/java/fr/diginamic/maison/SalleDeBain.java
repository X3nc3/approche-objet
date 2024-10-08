package fr.diginamic.maison;

public class SalleDeBain extends Piece{

    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }

    public String type() {
        return "Salle de bain";
    };

}
