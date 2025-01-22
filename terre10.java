public class terre10
{
    public static void main(String[] args)
    {
        if (args.length == 0)
            System.out.println("non bien, brah!, donne moi un argument NUMERIQUE");

        if(args.length > 1)
            System.out.println("woa, woa, woooaa brah!! j'ai dit UN argumet, pas un milion !!!");
                
        try
        {
            int chiffreARGS = (Integer.parseInt(args[0]));
            int resultat = MethodeSq(chiffreARGS);

            System.out.println("le chiffre a determiner est : " + chiffreARGS);
            System.out.println("il y a " + resultat + " chiffres a tester");

            int[] tableauMulti = new int[resultat];//creation du premier tableau.
            tableauMulti [0] = 2;

            for(int i = 1 ; i < tableauMulti.length ; i++)//CETTE BOUCLE CREE LE PREMIER TABLEAU A MULTIPLIER A PARTIR DE 2. ici i=1 car i=0 est deja defini comme un int de valeur 2.
            {
                tableauMulti[i] = tableauMulti[i-1]+1;
            }

            System.out.print("voici le PREMIER tableau : ");
            for(int i = 0 ; i < tableauMulti.length ; i++)//CETTE BOUCLE AFFICHE LE PREMIER TABLEAU
            {
                System.out.print(tableauMulti[i]);
                System.out.print(" ");
            }
            System.out.println();

            int[] tableauMulti2 = new int[MethodeMoitie(chiffreARGS)];//ICI ON DOIT CREER UN TABLEAU QUI COMMENCE PAR 1. SI NON ON N'AURAIT PAS TOUTES LES MULTIPLES DE JUSTE 2...
            tableauMulti2 [0] = 2;

            for(int i = 1 ; i < tableauMulti2.length ; i++)//CETTE BOUCLE CREE LE DEUXIEME TABLEAU A MULTIPLIER, QUI COMMENCE PAR INDEX[0] = 1.
            {
                tableauMulti2[i] = tableauMulti2[i-1]+1;
            }

            System.out.print("voici le DEUXIEME tableau : ");
            for(int i = 0 ; i < tableauMulti2.length ; i++)//CETTE BOUCLE AFFICHE LE PREMIER TABLEAU
            {
                System.out.print(tableauMulti2[i]);
                System.out.print(" ");
            }
            System.out.println();

            int[] tableauFinal = new int[tableauMulti.length * tableauMulti2.length];
            int index = 0;
            
            for(int i2 = 0 ; i2 < tableauMulti.length ; i2++)
            {
                for(int i3 = 0 ; i3 < tableauMulti2.length ; i3++)
                {
                    tableauFinal[index] = tableauMulti[i2] * tableauMulti2[i3];
                    index++;
                }
            }

            /* 
            for (int j = i; j < longueur; j++) //Éviter les répétitions (si vous ne voulez pas répéter les permutations comme 2×3 et 3×2) : Vous pouvez ajuster la boucle j pour commencer à i :
            {
                nouveauTableau[index] = tableau[i] * tableau[j];
                index++;
            }
            */

            /*for(int element2 : tableauFinal)//CETTE BOUCLE AFFICHE LE TABLEAU FINAL AVEC TOUTES LES MULTIPLICATIONS
            {
                System.out.print(element2 + " ");
            }
            System.out.println();*/

            //TRAVAIL POUR VOIR SI LA CHIFFRE EXISTE DANS LE TABLEAU; A CE MOMENT LE CHIFFRE NE PEUT PAS ETRE PREMIER.

            int position = existe(tableauFinal , chiffreARGS);
            if(position != -1)
            {
                System.out.println(chiffreARGS + " se trouve sur l'index " + position + " du tableauFinal. Le chiffre n'est pas une chiffre premier.");
            }
            else
            {   
                System.out.println(chiffreARGS + " ne se trouve pas dans le tableau. Le chiffre est premier.");
            }
        }    
        catch (ArrayIndexOutOfBoundsException ex)   
        {
            System.out.println("0 et 1 ne sont pas des arguments permis bolos!");
        }          

        catch (NumberFormatException ex)
        {
            String aChiffre = String.join("", args);
            String sChiffre = aChiffre;
            System.out.println("UNE CHIFFRE bolos! '" + sChiffre + "' est UNE lettre !!!");
        }
    }

    public static int MethodeSq(int chiffreARGS) 
    {
        int isq = 2;
        int pow = isq * isq;

        while(pow < chiffreARGS)
        {   
            pow = isq * isq;
            isq++;
            if(pow >= chiffreARGS)
            {
                break;
            }
        }
        return isq;
    }

    public static int MethodeMoitie(int chiffreARGS) 
    {
        int motie = chiffreARGS / 2;
        return motie;
    }

    static int existe(int Tab[] , int val)
    {
        for(int i = 0 ; i < Tab.length ; i++)
        {
            if(val == Tab[i])
            return i;
        }
        return -1;
    }
}

/* DEUXIEME PROPOSITION SIMPLIFIE
public static void main(String[] args) 
    {
        int chiffreARGS = (Integer.parseInt(args[0]));
        int moitie = chiffreARGS / 2;
        int tailleFinal = moitie * moitie;
        int[] tableauMultiplicateur = new int[moitie];
        int[] tableauFinal = new int[tailleFinal];
        int index1 = 0;
        int index2 = 0;

        for(int i = 2 ; i < tableauMultiplicateur.length + 2 ; i++){
            index1 = 0;
            for(int j = 2 ; j < tableauMultiplicateur.length + 2 ; j++){
                tableauMultiplicateur[index1] = j * i;
                index1++;
            }
            for(int k = 0 ; k < tableauMultiplicateur.length ; k++){
                tableauFinal[index2] = tableauMultiplicateur[k];
                index2++;
            }
        }

        //for(int element : tableauFinal){
        //    System.out.print(element + " ");
        //}
        System.out.println();

        int position = existe(tableauFinal , chiffreARGS);
        if(position != -1)
        {
            System.out.println(chiffreARGS + " se trouve sur l'index " + position + " du tableauFinal. Le chiffre n'est pas une chiffre premier.");
        }
        else
        {   
            System.out.println(chiffreARGS + " ne se trouve pas dans le tableau. Le chiffre est premier.");
        }
    }

    static int existe(int Tab[] , int val){
    for(int i = 0 ; i < Tab.length ; i++)
    {
        if(val == Tab[i])
        return i;
    }
    return -1;
    }
*/