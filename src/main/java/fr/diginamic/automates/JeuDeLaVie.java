package fr.diginamic.automates;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class JeuDeLaVie {
    //Création de la grille
    static boolean[][] grille = new boolean[25][50];

    //Initialisation de la grille avec un schémat aleatoire
    public static void initialisationGrille() {
        //Double boucle pour crée un tableau en 2D
        for (int i=0; i<25; i++) {
            for (int j=0; j<50; j++) {
                if (Math.random() < 0.5) {
                   grille[i][j] = true;
                }
            }
        }
    }

    //Méthode pour initialiser de la grille avec le schemat d'un fichier récuperé
    public static void initialisationGrilleAvecFichier(String path) throws IOException {
        //Récupération des données du fichier dans une liste
        List<String> lignesFichier = Files.readAllLines(Paths.get(path));

        //Initialiser toute les cellules de la grille à false
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 50; j++) {
                grille[i][j] = false;
            }
        }

        //Boucle sur la List des données du fichier récuperé pour séparer les cellules
        for (int i = 0; i < lignesFichier.size(); i++) {
            String[] cellules = lignesFichier.get(i).split(";");
            //Deuxieme boucle pour definir les cellules vivante (donc définir a true), grace a la Liste de donnée récuperé
            for (int j = 0; j < cellules.length; j++) {
                if (Objects.equals(cellules[j], "|X")) {
                    if ( j >= 0 && j < 50) {
                        grille[i][j] = true;
                    }
                }
            }
        }
    }

    //Méthode pour définir si les cellules adjacente font parti de la grille ou pas
    static int celluleAdj(int x, int y) {
            if (x > 0 && x < 25 && y > 0 && y < 50) {
                if (grille[x][y]) {
                    return 1;
                }
            }
            return 0;
        }

    //Méthode pour modifier la grille en fonction des régles du jeu
    public static void changementGrille() {
        //Création d'une nouvelle grille
        boolean[][] nouvelleGrille = new boolean[25][50];
        //Double boucle pour parcourir le tableau en 2D
        for (int i=0; i<25; i++) {
            for (int j=0; j<50; j++) {
                //Calcule du nombre de cellule adjacente en vie par rapport à la grille initial
                int nbCelluleAdj = 0;
                nbCelluleAdj += celluleAdj(i + 1, j);
                nbCelluleAdj += celluleAdj(i - 1, j);
                nbCelluleAdj += celluleAdj(i, j + 1);
                nbCelluleAdj += celluleAdj(i, j - 1);
                nbCelluleAdj += celluleAdj(i + 1, j + 1);
                nbCelluleAdj += celluleAdj(i - 1, j - 1);
                nbCelluleAdj += celluleAdj(i + 1, j - 1);
                nbCelluleAdj += celluleAdj(i - 1, j + 1);
                //Initialisation de la nouvelle grille par rapport à la grille initial
                nouvelleGrille[i][j] = grille[i][j];
                //Modification des cellules de la nouvelle grille par rapport aux régles du jeu
                if (nouvelleGrille[i][j]) {
                    if (nbCelluleAdj < 2 || nbCelluleAdj >3) {
                        nouvelleGrille[i][j] = false;
                    }
                } else if (!nouvelleGrille[i][j]) {
                    if (nbCelluleAdj == 3) {
                        nouvelleGrille[i][j] = true;
                    }
                }
            }
        }
        //Initialisation de la grille initial par rapport à la nouvelle grille
        grille = nouvelleGrille;
    }

    //Méthode pour afficher la grille dans la console
    public static void afficherGrille() {
        //Double boucle pour parcourir la grille et remplir les cellules vivante et morte
        for (int i=0; i<25; i++) {
            for (int j=0; j<50; j++) {
                if (grille[i][j]) {
                    System.out.print("|X");
                } else {
                    System.out.print("| ");
                }
            }
            //Saut de ligne pour afficher une grille dans la console
            System.out.println("");
        }
        //saut de ligne entre chaque nouvelle grille
        System.out.println("");
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        //Scanner pour demander à l'utilisateur de choisir une option
        Scanner scanner = new Scanner(System.in);
        int choix;

        //Boucle Do While pour afficher les options tant que l'utilisateur n'a pas rentrée un choix proposé
        do {
            //Affichage des choix et récupération de la réponse du scanner
            System.out.println("Choisissez une option :\n1 : départ de soupe aléatoire\n2 : départ avec la config Planeur\n3 : départ avec la config LWSS\n4 : départ avec la config Canon");
            choix = scanner.nextInt();

            //Switch pour éxecuter le code en fonction du choix de l'utilisateur
            switch (choix) {
                case 1:
                    //Appel des méthodes et création d'un boucle pour afficher les grille à chaque itération
                    initialisationGrille();
                    int nbGeneration = Integer.MAX_VALUE;
                    for (int i = 0; i < nbGeneration; i++) {
                        afficherGrille();
                        changementGrille();
                        Thread.sleep(300);
                    }
                    break;
                case 2:
                    //Récuperation du chemin du fichier et appel des méthodes et création d'un boucle pour afficher les grille à chaque itération
                    String path1 = "C:\\Users\\XenceMaster\\Documents\\Code\\courDiginamic\\tp_approche_objets\\approche-objet\\src\\main\\java\\fr\\diginamic\\automates\\Config départ planeur.csv";
                    initialisationGrilleAvecFichier(path1);
                    nbGeneration = Integer.MAX_VALUE;
                    for (int i = 0; i < nbGeneration; i++) {
                        afficherGrille();
                        changementGrille();
                        Thread.sleep(300);
                    }
                    break;
                case 3:
                    //Récuperation du chemin du fichier et appel des méthodes et création d'un boucle pour afficher les grille à chaque itération
                    String path2 = "C:\\Users\\XenceMaster\\Documents\\Code\\courDiginamic\\tp_approche_objets\\approche-objet\\src\\main\\java\\fr\\diginamic\\automates\\Config départ LWSS.csv";
                    initialisationGrilleAvecFichier(path2);
                    nbGeneration = Integer.MAX_VALUE;
                    for (int i = 0; i < nbGeneration; i++) {
                        afficherGrille();
                        changementGrille();
                        Thread.sleep(300);
                    }
                    break;
                case 4:
                    //Récuperation du chemin du fichier et appel des méthodes et création d'un boucle pour afficher les grille à chaque itération
                    String path3 = "C:\\Users\\XenceMaster\\Documents\\Code\\courDiginamic\\tp_approche_objets\\approche-objet\\src\\main\\java\\fr\\diginamic\\automates\\Config départ canon.csv";
                    initialisationGrilleAvecFichier(path3);
                    nbGeneration = Integer.MAX_VALUE;
                    for (int i = 0; i < nbGeneration; i++) {
                        afficherGrille();
                        changementGrille();
                        Thread.sleep(300);
                    }
                    break;
                default:
                    //Affichage dans la console d'un mauvaix choix effectué
                    System.out.println("Vous n'avez pas choisis une des options demandées !");
                    break;
            }
        } while (choix < 1 || choix > 4); //Condition de répetition de la boucle Do While en fonction des 4 choix proposés
    }
}
