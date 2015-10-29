import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Random string: " );
        String sent = scan.next();
        int len = sent.length();
        int k = 0;
        for(int i = 1; i != len + 1; i++)
        {
            String sub = sent.substring(k,i);
            System.out.println(sub);
            k++;
        }
        for(int j = 1; j != len; j++)
        {
            String sub2 = sent.substring(1,j);
            System.out.println(sub2);
        }
    }
}
