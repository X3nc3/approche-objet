package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {
    private static Scanner scanner = new Scanner(System.in);
    private static Personnage newPerso;
    private static Creature newCreature;
    private static int d10;

    public static void main(String[] args) {
        boolean continuer = true;
        while (continuer) {
            menu();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1 :
                    creationPersonnage();
                    break;
                case 2 :
                    if (newPerso == null) {
                        System.out.println("Vous n'avez pas crée de personnage !");
                        break;
                    }

                    creationCreature();

                    while (newPerso.getPointsDeVie() > 0 && newCreature.getPointsDeVie() > 0) {
                        creationDunNombreRandom();
                        int attPerso = newPerso.getForce() + d10;
                        creationDunNombreRandom();
                        int attCreature = newCreature.getForce() + d10;

                        if (attPerso > attCreature) {
                            int degats = attPerso - attCreature;
                            newCreature.setPointsDeVie(newCreature.getPointsDeVie() - degats);
                            System.out.println("Le perso donne un coup, "+ degats +" dégats à la créature");
                        } else if (attCreature > attPerso) {
                            int degats = attCreature - attPerso;
                            newPerso.setPointsDeVie(newPerso.getPointsDeVie() - degats);
                            System.out.println("La créature donne un coup, "+ degats +" dégats au personnage");
                        }else if (attCreature == attPerso) {
                            System.out.println("Attaque égale pas de degats");
                        }
                    }
                    if (newCreature.getPointsDeVie() <= 0) {
                        newPerso.setScore(newPerso.getScore() + newCreature.getPoints());
                        System.out.println("Vous avez gagné contre un " +newCreature.getNom()+ ", votre score est de : " +newPerso.getScore() );
                    } else if (newPerso.getPointsDeVie() <= 0) {
                        System.out.println("Votre personnage est décédé contre un "+ newCreature.getNom()+". il a obtenu le score de : " +newPerso.getScore()+ " points\nVeuillez créer un nouveau personnage.");
                    }
                    break;
                case 3 :
                    if (newPerso == null) {
                        System.out.println("Vous n'avez pas crée de personnage !");
                    } else {
                        System.out.println("Le score de votre personnage est de : " + newPerso.getScore());
                    }
                    break;
                case 4 :
                    continuer = false;
                    System.out.println("Fin du jeu !");
                    break;
                default :
                    System.out.println("Vous n'avez pas choisis une des options possible !\n");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Menu du jeu\n1-Crée un personnage\n2-Combattre une créature\n3-Afficher le score\n4-Sortir");
    }

    public static void creationPersonnage() {
        int maxForce = 15;
        int minForce = 10;
        int rangeForce = maxForce - minForce + 1;
        int forcePerso = (int)(Math.random() * rangeForce) + minForce;

        int maxPointDeVie = 50;
        int minPointDeVie = 20;
        int rangePointDeVie = maxPointDeVie - minPointDeVie + 1;
        int pointDeViePerso = (int)(Math.random() * rangePointDeVie) + minPointDeVie;

        newPerso = new Personnage(forcePerso, pointDeViePerso, 0);
        System.out.println("Vous avez crée un nouveau personnage");
    }

    public static void creationCreature() {
        int randomCreature = (int)(Math.random() * 3) + 1;

        switch (randomCreature) {
            case 1 :
                int maxForce = 8;
                int minForce = 3;
                int rangeForce = maxForce - minForce + 1;
                int forceLoup = (int)(Math.random() * rangeForce) + minForce;

                int maxPointDeVie = 10;
                int minPointDeVie = 5;
                int rangePointDeVie = maxPointDeVie - minPointDeVie + 1;
                int pointDeVieLoup = (int)(Math.random() * rangePointDeVie) + minPointDeVie;

                newCreature = new Loup("Loup", forceLoup, pointDeVieLoup, 1);
                break;
            case 2 :
                maxForce = 10;
                minForce = 5;
                rangeForce = maxForce - minForce + 1;
                int forceGobelin = (int)(Math.random() * rangeForce) + minForce;

                maxPointDeVie = 15;
                minPointDeVie = 10;
                rangePointDeVie = maxPointDeVie - minPointDeVie + 1;
                int pointDeVieGobelin = (int)(Math.random() * rangePointDeVie) + minPointDeVie;

                newCreature = new Gobelin("Gobelin", forceGobelin, pointDeVieGobelin, 2);
                break;
            case 3 :
                maxForce = 15;
                minForce = 10;
                rangeForce = maxForce - minForce + 1;
                int forceTroll = (int)(Math.random() * rangeForce) + minForce;

                maxPointDeVie = 30;
                minPointDeVie = 20;
                rangePointDeVie = maxPointDeVie - minPointDeVie + 1;
                int pointDeVieTroll = (int)(Math.random() * rangePointDeVie) + minPointDeVie;

                newCreature = new Gobelin("Troll", forceTroll, pointDeVieTroll, 5);
                break;
        }
    }

    public static void creationDunNombreRandom() {
        int maxNombre = 10;
        int minNombre = 1;
        int rangeNombre = maxNombre - minNombre + 1;
        int randomNum = (int)(Math.random() * rangeNombre) + minNombre;

        d10 = randomNum;
    }
}
