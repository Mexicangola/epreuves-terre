public class terre15
{ 
    public static void main(String[] args) 
    {
        String message1 = "J'ai terminée l'epreuve de la terre et c'etait : ";
        String message2 = String.join(" ", args);
        
        System.out.println(message1 + message2);
    }
}