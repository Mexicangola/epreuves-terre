// Créez un programme qui affiche les arguments qu’il reçoit ligne par ligne, peu importe le nombre d’arguments.

public class terre02
{
    public static void main(String[] args)
    {
        for(int i = 0 ; i != args.length ; i++){
            System.out.println(args[i]);
        }
    }
}