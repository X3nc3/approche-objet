package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws IOException {

        Path pathOrigin = Paths.get("C:/Users/XenceMaster/Documents/Code/courDiginamic/tp_approche_objets/recensement.csv");
        Path pathModif = Paths.get("C:/Users/XenceMaster/Documents/Code/courDiginamic/tp_approche_objets/recensement2.csv");

        List<String> fichierRecensementOrigin = Files.readAllLines(pathOrigin);
        List<String > fichierRecensementModifie = new ArrayList<>();

        for (int i=0; i<100; i++) {
            fichierRecensementModifie.add(fichierRecensementOrigin.get(i));
        }

        Files.write(pathModif,fichierRecensementModifie);

    }
}
