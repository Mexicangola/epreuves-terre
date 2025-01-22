public class terre07
{
    public static void main(String[] args)
    {
        String message = String.join(" ", args);
        String[] splitMessage = message.split(" ");
        for(int i = 0 ; i < splitMessage.length ; i = i + 2){
            splitMessage[i] = (splitMessage[i]).toUpperCase();
        }
        String message2 = String.join("", splitMessage);
        System.out.println(message2);
    }
}
