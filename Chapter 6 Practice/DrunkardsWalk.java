import java.util.Random;

public class DrunkardsWalk
{
    public static void main(String[] args)
    {
        Random path = new Random();
        int x = 0;
        int y = 0;
        for(int i = 0; i <= 100; i++)
        {
            int newpath = path.nextInt(4);
            if(newpath == 1)
            {
                y -= 1;
            }
            if(newpath == 2)
            {
                x -= 1;
            }
            if(newpath == 3)
            {
                y += 1;
            }
            if(newpath == 4)
            {
                x += 1;
            }
            System.out.println( x + "," + y );
        }
    }
}
