public class terre14
{ 
    public static void main(String[] args) 
    {
        if(args.length == 0 || args.length == 1)
        {
            System.out.println("tu dois me donner plus de 2 arguments numeriques");
        }

        if(args.length > 1)
        try
        {
            int[] iTableau = new int[args.length];

            for(int i = 0 ; i < args.length ; i++)
            {
                iTableau[i] = Integer.parseInt(args[i]);
            }

            /*for(int element : iTableau)
            {
                System.out.print(element + " ");
            }
            System.out.println();*/

            for(int i = 1 ; i < iTableau.length ; i++)
            {
                if(iTableau[i] < iTableau[i-1])
                {
                    System.out.println("les chiffres sont en desordre");
                    System.exit(1);
                }         
            }

            System.out.println("les chiffres sont dans le bon ordre");
        }
        
        catch(Exception e)
        {
            System.out.println("donne moi des arguments numeriques, sans lettres!");       
        }
    }
}
