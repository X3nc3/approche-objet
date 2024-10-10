package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {

        ArrayList<Ville> ville = new ArrayList<>();

        Path path = Paths.get("C:/Users/XenceMaster/Documents/Code/courDiginamic/tp_approche_objets/recensement.csv");

        List<String> fichierRecensementOrigin = Files.readAllLines(path);

        for (int i=1; i<fichierRecensementOrigin.size(); i++) {
            String[] tokens = fichierRecensementOrigin.get(i).split(";");

            String nom = tokens[6];
            String codePostal = tokens[0] + tokens[2] + tokens[3] + tokens[4];
            String nomRegion = tokens[1];
            int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

            ville.add(new Ville(nom, codePostal, nomRegion, population));
        }

        List<String > fichierRecensementModifiePlusDe25000 = new ArrayList<>();
        fichierRecensementModifiePlusDe25000.add("Nom de la commune ; Code postal ; nom de la région ; Population total");

        Path pathModifPlusDe25000 = Paths.get("C:/Users/XenceMaster/Documents/Code/courDiginamic/tp_approche_objets/recensement3.csv");

        for (int i=0; i< ville.size(); i++) {
            if ( ville.get(i).getPopulation() > 25_000) {
                fichierRecensementModifiePlusDe25000.add(String.valueOf(ville.get(i)));
            }
        }

        Files.write(pathModifPlusDe25000,fichierRecensementModifiePlusDe25000);
    }
}
