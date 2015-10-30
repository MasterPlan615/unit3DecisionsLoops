import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Random string: " );
        String sent = scan.next();
        int len = sent.length();
        int i = 1;
        for(int k = 0; k <= len; k++)
        {
            int g = 0;
            for(int a = i; a <= len; a++)
            {
                String sub = sent.substring(g,a);
                System.out.println(sub);
                g++;
            }
            i++;
        }
    }
}
