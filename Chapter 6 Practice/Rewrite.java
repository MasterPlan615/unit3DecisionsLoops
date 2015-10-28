import java.util.Scanner;

public class Rewrite
{
    public static void main(String[] args)
    {
        int s = 0;
        int i = 1;
        while(i <= 10)
        {
            s = s + i;
            i++;
        }
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        double x = 0;
        double a = 1;
        while( a > 0.01)
        {
            a = 1.0/(1 + n * n);
            n++;
            x = x + a;
        }
    }
}
