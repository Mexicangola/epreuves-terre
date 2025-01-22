public class terre13
{ 
    public static void main(String[] args) 
    {
        if(args.length != 3)
        {
            System.out.println("tu dois me donner 3 arguments numeriques");
        }

        if(args.length == 3)
        try
        {
            int A = Integer.parseInt(args[0]);
            int B = Integer.parseInt(args[1]);
            int C = Integer.parseInt(args[2]);

            if(A<B && B<C)
            {
                System.out.println(B);
            }
            if(A<B && B>C && A<C)
            {
                System.out.println(C);
            }
            if(A>B && B<C && A<C)
            {
                System.out.println(A);
            }
            if(A<B && B>C && A>C)
            {
                System.out.println(A);
            }
            if(A>B && B<C && A>C)
            {
                System.out.println(C);
            }
            if(A>B && B>C)
            {
                System.out.println(B);
            }

            if(A == B || A == C || B == C)
            {
                System.out.println("tu ne peut pas donner 2 fois la meme chiffre");
            }
        }

        catch(Exception e)
        {
            System.out.println("il faut donner 3 chiffres");
        }
    }
}