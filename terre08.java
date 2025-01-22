public class terre08
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("non bien, brah!, donne moi DEUX argument NUMERIQUES");
        }    
        else if (args.length == 1)
            try
            {
                String aChiffre = String.join("", args);
                String sChiffre = aChiffre;
                int iChiffre = Integer.parseInt(sChiffre);
                System.out.println("t'as juste doné la chiffre " + iChiffre + " mais je veux une autre !");
            }
            catch (NumberFormatException ex)
            {
                String aChiffre = String.join("", args);
                String sChiffre = aChiffre;
                System.out.println("DEUX CHIFFRES bolos! '" + sChiffre + "' est UNE lettre !!!");
            }
        else if (args.length == 2)
            try
            {
                int chiffre = Integer.parseInt(args[0]);
                int puissance = Integer.parseInt(args[1]);
                int[] tableau = new int[puissance-1]; //je cree un tableau avec le nombre d'elements du chiffre.   

                tableau[0] = chiffre*chiffre;//definir le premier index comme le carrée d'args[0]

                for(int i = 1 ; i < tableau.length ; i++)//Cette boucle for CREE LE TABLEAU, le dernier index sera la puissance.
                {
                    tableau[i] = tableau[i-1] * chiffre;//tableau[i] = [4, ([i-1]*chiffre), ([i-1]*chiffre), etc...]; repeter cette opp xfois (fois = tableau.length)
                }

                System.out.println(tableau[tableau.length-1]); //afficher le dernier index du tableau, donc la puissance

            }
            catch (NumberFormatException ex)
            {
                System.out.println("il faut deux chiffres bolos !!");
            }
        else
        {
            System.out.println("woa, woa, woooaa brah!! j'ai dit DEUX argumets, pas un milion !!!");
        }
    }
}

/* METHODE 1 OK, experimentations boucle for
import java.util.*;
import java.util.stream.IntStream; 

public class TESTterre
{
    public static void main(String[] args)
    {
        int chiffre = Integer.parseInt(args[0]);
        int puissance = Integer.parseInt(args[1]);
        int[] tableau = new int[puissance-1]; //je cree un tableau avec le nombre d'elements du chiffre.   

        tableau[0] = chiffre*chiffre;//definir le premier index comme le carrée d'args[0]
        System.out.println(tableau[0]);

        for(int i = 1 ; i < tableau.length ; i++)//Cette boucle for CREE LE TABLEAU
        {
            tableau[i] = tableau[i-1] * chiffre;//tableau[i] = [4, ([i-1]*chiffre), ([i-1]*chiffre), etc...]; repeter cette opp xfois (fois = tableau.length)
        }

        for(int i = 0 ; i < tableau.length ; i++) //Cette boucle for AFFICHE LE TABLEAU
        {
            System.out.print(tableau[i]);// print tous les index du tableau qu'on viens de creer
        }

        System.out.println();

        for(int element : tableau)//Cette boucle for AFFICHE LE TABLEAU
        {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(tableau[tableau.length-1]); //afficher le dernier index du tableau, donc la puissance
    }
}
*/

/* Un caprice d'affichage
        String delimiteur = ", ";
        String delimiteurOuverture = "[";
        String delimiteurFermature = "]";
        for(int i = 0 ; i < tableau.length ; i++)//Cette boucle for AFFICHE LE TABLEAU
        {
            if(i == 0) //au debut, affin de mettre [...
            System.out.print(delimiteurOuverture);
            System.out.print(tableau[i]);// print tous les index du tableau qu'on viens de creer
            if(i < tableau.length-1)//tant que i est inferieur a length du tableau, on met le delimiteur ", " apres chaque element
            System.out.print(delimiteur);
            if(i == tableau.length-1)//une fois que le tableau fais sa longeur - 1 afficher le delimiteur fermature "]"
            System.out.print(delimiteurFermature);
        } // => [9, 27, 81, 243]

*/