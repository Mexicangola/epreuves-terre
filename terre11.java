public class terre11
{ 
    public static void main(String[] args) 
    {
        if(args.length == 0)
        {
            System.out.println("donne moi l'heure stp");
        }

        if(args.length > 1)
        {
            System.out.println("trop d'arguments");
        }

        if(args.length == 1)
        try
        {
            String heureARGS = args[0];

            String[] heuresMinutes = heureARGS.split(":");
            int iHeures = Integer.parseInt(heuresMinutes[0]);
            int iMinutes = Integer.parseInt(heuresMinutes[1]);

            if(iHeures <= 12)
            {
                System.out.println(iHeures + ":" + iMinutes + "am");
            }

            if(iHeures > 12)
            {
                System.out.println(iHeures-12 + ":" + iMinutes + "pm");
            }
        }

        catch(Exception e)
        {
            System.out.println("le format d'heure que tu m'as doné n'est pas correct. il faut une heure comme ca : 15:45");
        }
    }
        
}

/* ASTUCE POUR SEPARER LES CHIFFRES DES NUMEROS (CHATGPT):
public class Exemple {
    public static void main(String[] args) {
        String[] tableau = {"11:55am"};
        for (String element : tableau) {
            String[] heureMinute = element.split("[:apm]+"); // Divise par ":" et par "am" ou "pm"
            
            // Affiche les valeurs numériques obtenues
            System.out.println("Heure : " + heureMinute[0]); // 11
            System.out.println("Minute : " + heureMinute[1]); // 55
        }
    }
}
=> Voici comment utiliser .split() pour diviser "11:55am" en {11, 55} :

Explication:
Expression régulière pour .split :

L’expression [:apm]+ signifie :
: pour diviser à chaque deux-points.
[apm] pour matcher tous les caractères a, p, ou m (pour am ou pm).
+ pour indiquer qu’un ou plusieurs de ces caractères peuvent être présents.
Ainsi, .split("[:apm]+") divise la chaîne "11:55am" en deux parties : "11" et "55".
Stockage des résultats :

Le tableau heureMinute contiendra :
heureMinute[0] : "11"
heureMinute[1] : "55"
*/

/* ASTUCE POUR SEPARER LES CHIFFRES DES NUMEROS (CHATGPT):
Pour gérer des formats d’heure non standards (comme 11:55 PM avec un espace), vous pouvez enrichir l’expression régulière :
element.split("[:\\sAPMapm]+"); // Ajoute l'espace ou des majuscules
*/