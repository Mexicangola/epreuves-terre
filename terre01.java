// Créez un programme qui affiche son nom de fichier.
import java.io.File;

public class terre01
{
    public static void main(String[] args)
    {
        String className = terre01.class.getSimpleName(); // Récupérer le nom de la classe

        String fileName = className + ".java"; // Ajouter l'extension ".java"

        System.out.println("Le nom du fichier est : " + fileName); // Afficher le nom du fichier
    }
}