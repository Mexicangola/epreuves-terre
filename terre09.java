public class terre09
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("non bien, brah!, donne moi un argument NUMERIQUE");
        }    
        else if (args.length == 1)
            try
            {
                String aChiffre = String.join("", args);
                String sChiffre = aChiffre;
                int iChiffre = Integer.parseInt(sChiffre);
                int isq = 2;
                int pow = isq * isq;

                while(pow < iChiffre)
                {   
                    isq++;
                    pow = isq * isq;
                    if(pow >= iChiffre)
                    break;
                }
                if(pow == iChiffre)
                {
                    System.out.println("la racine carée de " + iChiffre + " est " + isq);
                }
                else
                {
                    System.out.println(iChiffre + " n'a pas de racine carée entiere, booolos!");
                }
            }
            catch (NumberFormatException ex)
            {
                String aChiffre = String.join("", args);
                String sChiffre = aChiffre;
                System.out.println("UNE CHIFFRE bolos! '" + sChiffre + "' est UNE lettre !!!");
            }
        else
        {
            System.out.println("woa, woa, woooaa brah!! j'ai dit UN argumet, pas un milion !!!");
        }
    }
}