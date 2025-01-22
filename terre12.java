public class terre12
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

            String[] heuresMinutes = heureARGS.split("");
            //for(String element : heuresMinutes)
            //    System.out.println(element);

            String index0 = heuresMinutes[0];
            String index1 = heuresMinutes[1];
            String index3 = heuresMinutes[3];
            String index4 = heuresMinutes[4];
            String index5 = heuresMinutes[5];
            String index6 = heuresMinutes[6];

            String sHeures = (index0 + index1);
            String sMinutes = (index3 + index4);
            String AMPM = (index5 + index6);

            //System.out.println("les heures : " + sHeures + " et les minutes : " + sMinutes);
            //System.out.println(AMPM);

            int iHeures = Integer.parseInt(sHeures);

            //System.out.println("les heures en int : " + iHeures);

            if(AMPM.equals("am"))
            {
                System.out.println(sHeures + ":" + sMinutes);
            }

            if(iHeures < 12 && AMPM.equals("pm"))
            {
                int iHeures2 = iHeures + 12;
                System.out.println(iHeures2 + ":" + sMinutes);
            }

            if(iHeures >= 12 && AMPM.equals("pm"))
            {
                iHeures = iHeures + 11;
                System.out.println(iHeures + ":" + sMinutes);
            }
        }

        catch(Exception e)
        {
            System.out.println("le format d'heure que tu m'as doné n'est pas correct. il faut une heure comme ca : 05:45am");
        }
    } 
}